package com.jewel.ecom.repository;

import com.jewel.ecom.entity.PaymentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaymentRepository extends CrudRepository<PaymentEntity, UUID> {
}