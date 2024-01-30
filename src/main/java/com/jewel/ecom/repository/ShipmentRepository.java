package com.jewel.ecom.repository;

import com.jewel.ecom.entity.ShipmentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ShipmentRepository extends CrudRepository<ShipmentEntity, UUID> {
}