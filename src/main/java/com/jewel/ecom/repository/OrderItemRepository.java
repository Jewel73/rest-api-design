package com.jewel.ecom.repository;

import com.jewel.ecom.entity.OrderItemEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderItemRepository extends CrudRepository<OrderItemEntity, UUID> {
}