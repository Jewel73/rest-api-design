package com.jewel.ecom.service;

import com.jewel.ecom.api.model.AddAddressReq;
import com.jewel.ecom.entity.AddressEntity;
import com.jewel.ecom.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository repository;

    public AddressServiceImpl(AddressRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<AddressEntity> createAddress(AddAddressReq addAddressReq) {
        return Optional.of(repository.save(toEntity(addAddressReq)));
    }

    @Override
    public void deleteAddressesById(String id) {
        repository.deleteById(UUID.fromString(id));
    }

    @Override
    public Optional<AddressEntity> getAddressesById(String id) {
        return repository.findById(UUID.fromString(id));
    }

    @Override
    public Iterable<AddressEntity> getAllAddresses() {
        return repository.findAll();
    }

    private AddressEntity toEntity(AddAddressReq model) {
        AddressEntity entity = new AddressEntity();
        return entity.setNumber(model.getNumber()).setResidency(model.getResidency())
                .setStreet(model.getStreet()).setCity(model.getCity()).setState(model.getState())
                .setCountry(model.getCountry()).setPincode(model.getPincode());
    }
}