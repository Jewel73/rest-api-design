package com.jewel.ecom.service;

import com.jewel.ecom.entity.ProductEntity;
import com.jewel.ecom.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<ProductEntity> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Optional<ProductEntity> getProduct(String id) {
        return repository
                .findById(UUID.fromString(id));
    }
}