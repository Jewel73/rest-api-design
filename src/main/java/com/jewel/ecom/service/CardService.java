package com.jewel.ecom.service;

import com.jewel.ecom.api.model.AddCardReq;
import com.jewel.ecom.entity.CardEntity;
import jakarta.validation.Valid;

import java.util.Optional;

public interface CardService {
    void deleteCardById(String id);
    Iterable<CardEntity> getAllCards();
    Optional<CardEntity> getCardById(String id);
    Optional<CardEntity> registerCard(@Valid AddCardReq addCardReq);
}