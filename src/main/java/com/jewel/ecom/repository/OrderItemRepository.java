package com.jewel.ecom.repository;

import com.jewel.ecom.entity.OrderItemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderItemRepository extends CrudRepository<OrderItemEntity, UUID> {
}