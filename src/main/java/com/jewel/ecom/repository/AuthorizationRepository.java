package com.jewel.ecom.repository;

import com.jewel.ecom.entity.AuthorizationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AuthorizationRepository extends CrudRepository<AuthorizationEntity, UUID> {
}