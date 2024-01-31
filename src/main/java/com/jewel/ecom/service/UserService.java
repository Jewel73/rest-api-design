package com.jewel.ecom.service;

import com.jewel.ecom.entity.AddressEntity;
import com.jewel.ecom.entity.CardEntity;
import com.jewel.ecom.entity.UserEntity;

import java.util.Optional;

public interface UserService {
    void deleteCustomerById(String id);
    Optional<Iterable<AddressEntity>> getAddressesByCustomerId(String id);
    Iterable<UserEntity> getAllCustomers();
    Optional<CardEntity> getCardByCustomerId(String id);
    Optional<UserEntity> getCustomerById(String id);
}