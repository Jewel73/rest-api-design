package com.jewel.ecom.service;

import com.jewel.ecom.api.model.PaymentReq;
import com.jewel.ecom.entity.AuthorizationEntity;
import com.jewel.ecom.entity.OrderEntity;
import com.jewel.ecom.repository.OrderRepository;
import com.jewel.ecom.repository.PaymentRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository repository;
    private final OrderRepository orderRepo;

    public PaymentServiceImpl(PaymentRepository repository, OrderRepository orderRepo) {
        this.repository = repository;
        this.orderRepo = orderRepo;
    }

    @Override
    public Optional<AuthorizationEntity> authorize(@Valid PaymentReq paymentReq) {
        return Optional.empty();
    }

    @Override
    public Optional<AuthorizationEntity> getOrdersPaymentAuthorization(@NotNull String orderId) {
        return orderRepo.findById(UUID.fromString(orderId)).map(OrderEntity::getAuthorizationEntity);
    }

  /*private AuthorizationEntity toEntity(PaymentReq m) {
    PaymentEntity e = new PaymentEntity();
    e.setAuthorized(true).setMessage()
  }*/
}