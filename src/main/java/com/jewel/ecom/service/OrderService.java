package com.jewel.ecom.service;

import com.jewel.ecom.api.model.NewOrder;
import com.jewel.ecom.entity.OrderEntity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Optional;

public interface OrderService {

    Optional<OrderEntity> addOrder(@Valid NewOrder newOrder);
    Iterable<OrderEntity> getOrdersByCustomerId(@NotNull @Valid String customerId);
    Optional<OrderEntity> getByOrderId(String id);
}