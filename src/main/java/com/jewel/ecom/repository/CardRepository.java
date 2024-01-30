package com.jewel.ecom.repository;

import com.jewel.ecom.entity.CardEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CardRepository extends CrudRepository<CardEntity, UUID> {
}