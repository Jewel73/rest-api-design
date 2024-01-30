package com.jewel.ecom.repository;

import com.jewel.ecom.entity.ShipmentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShipmentRepository extends CrudRepository<ShipmentEntity, UUID> {
}