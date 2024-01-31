package com.jewel.ecom.service;

import com.jewel.ecom.entity.ShipmentEntity;
import com.jewel.ecom.repository.ShipmentRepository;
import jakarta.validation.constraints.Min;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository repository;

    public ShipmentServiceImpl(ShipmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<ShipmentEntity> getShipmentByOrderId(
            @Min(value = 1L, message = "Invalid shipment ID.") String id) {
        return repository.findAllById(List.of(UUID.fromString(id)));
    }
}