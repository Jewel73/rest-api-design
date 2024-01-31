package com.jewel.ecom.service;

import com.jewel.ecom.entity.AddressEntity;
import com.jewel.ecom.entity.CardEntity;
import com.jewel.ecom.entity.UserEntity;
import com.jewel.ecom.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deleteCustomerById(String id) {
        repository.deleteById(UUID.fromString(id));
    }

    @Override
    public Optional<Iterable<AddressEntity>> getAddressesByCustomerId(String id) {
        return repository.findById(UUID.fromString(id)).map(UserEntity::getAddress);
    }

    @Override
    public Iterable<UserEntity> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public Optional<CardEntity> getCardByCustomerId(String id) {
        return Optional.of(repository.findById(UUID.fromString(id)).map(UserEntity::getCards).get().get(0));
    }

    @Override
    public Optional<UserEntity> getCustomerById(String id) {
        return repository.findById(UUID.fromString(id));
    }
}