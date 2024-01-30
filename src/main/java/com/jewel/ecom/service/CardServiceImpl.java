package com.jewel.ecom.service;

import com.jewel.ecom.api.model.AddCardReq;
import com.jewel.ecom.entity.CardEntity;
import com.jewel.ecom.entity.UserEntity;
import com.jewel.ecom.repository.CardRepository;
import com.jewel.ecom.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CardServiceImpl implements CardService {
    private final CardRepository repository;
    private final UserRepository userRepo;

    public CardServiceImpl(CardRepository repository, UserRepository userRepo) {
        this.repository = repository;
        this.userRepo = userRepo;
    }

    @Override
    public void deleteCardById(String id) {
        repository.deleteById(UUID.fromString(id));
    }

    @Override
    public Iterable<CardEntity> getAllCards() {
        return repository.findAll();
    }

    @Override
    public Optional<CardEntity> getCardById(String id) {
        return repository.findById(UUID.fromString(id));
    }

    @Override
    public Optional<CardEntity> registerCard(@Valid AddCardReq addCardReq) {
        // add validation to make sure that only single card exists from one user
        // else it throws DataIntegrityViolationException for user_id (unique)
        return Optional.of(repository.save(toEntity(addCardReq)));
    }

    private CardEntity toEntity(AddCardReq m) {
        CardEntity e = new CardEntity();
        Optional<UserEntity> user = userRepo.findById(UUID.fromString((String) m.getUserId()));
        user.ifPresent(e::setUser);
        return e.setNumber(m.getCardNumber()).setCvv(m.getCvv())
                .setExpires(m.getExpires());
    }
}