package com.jewel.ecom.repository;

import com.jewel.ecom.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AddressRepository extends CrudRepository<AddressEntity, UUID> {
}