package com.jewel.ecom.repository;

import com.jewel.ecom.api.model.NewOrder;
import com.jewel.ecom.entity.OrderEntity;

import java.util.Optional;

public interface OrderRepositoryExt {
    Optional<OrderEntity> insert(NewOrder m);
}
