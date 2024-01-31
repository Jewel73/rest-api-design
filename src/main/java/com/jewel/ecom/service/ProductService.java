package com.jewel.ecom.service;

import com.jewel.ecom.entity.ProductEntity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.Optional;

@Validated
public interface ProductService {
    @NotNull Iterable<ProductEntity> getAllProducts();
    Optional<ProductEntity> getProduct(@Min(value = 1L, message = "Invalid product ID.") String id);
}