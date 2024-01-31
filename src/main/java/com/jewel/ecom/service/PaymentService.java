package com.jewel.ecom.service;

import com.jewel.ecom.api.model.PaymentReq;
import com.jewel.ecom.entity.AuthorizationEntity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Optional;

public interface PaymentService {
    Optional<AuthorizationEntity> authorize(@Valid PaymentReq paymentReq);
    Optional<AuthorizationEntity> getOrdersPaymentAuthorization(@NotNull String orderId);
}
