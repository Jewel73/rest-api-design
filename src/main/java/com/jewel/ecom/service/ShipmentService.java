package com.jewel.ecom.service;

import com.jewel.ecom.entity.ShipmentEntity;
import jakarta.validation.constraints.Min;

public interface ShipmentService {
    Iterable<ShipmentEntity> getShipmentByOrderId(@Min(value = 1L, message = "Invalid product ID.")  String id);
}