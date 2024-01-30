package com.jewel.ecom.service;

import com.jewel.ecom.api.model.AddAddressReq;
import com.jewel.ecom.entity.AddressEntity;

import java.util.Optional;

public interface AddressService {
    Optional<AddressEntity> createAddress(AddAddressReq addAddressReq);

    void deleteAddressesById(String id);

    Optional<AddressEntity> getAddressesById(String id);

    Iterable<AddressEntity> getAllAddresses();
}