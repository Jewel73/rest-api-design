package com.jewel.ecom.repository;

import com.jewel.ecom.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AddressRepository extends CrudRepository<AddressEntity, UUID> {
}