package com.jewel.ecom.repository;

import com.jewel.ecom.entity.AuthorizationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AuthorizationRepository extends CrudRepository<AuthorizationEntity, UUID> {
}