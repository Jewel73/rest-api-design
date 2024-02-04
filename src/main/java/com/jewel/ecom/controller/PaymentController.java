package com.jewel.ecom.controller;

import com.jewel.ecom.api.PaymentApi;

import com.jewel.ecom.api.model.Authorization;
import com.jewel.ecom.api.model.PaymentReq;
import com.jewel.ecom.hateoas.PaymentRepresentationModelAssembler;
import com.jewel.ecom.service.PaymentService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PaymentController implements PaymentApi {

    private final PaymentService service;
    private final PaymentRepresentationModelAssembler assembler;

    public PaymentController(PaymentService service, PaymentRepresentationModelAssembler assembler) {
        this.service = service;
        this.assembler = assembler;
    }

    @Override
    public ResponseEntity<Authorization> authorize(@Valid PaymentReq paymentReq) {
        return null;
    }

    @Override
    public ResponseEntity<Authorization> getOrdersPaymentAuthorization(
            @NotNull @Valid String id) {
        return null;
    }
}