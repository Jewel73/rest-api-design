package com.jewel.ecom.repository;

import com.jewel.ecom.entity.CardEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CardRepository extends CrudRepository<CardEntity, UUID> {
}