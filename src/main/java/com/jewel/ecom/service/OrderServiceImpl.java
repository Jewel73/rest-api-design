package com.jewel.ecom.service;

import com.jewel.ecom.api.model.NewOrder;
import com.jewel.ecom.entity.OrderEntity;
import com.jewel.ecom.exception.ResourceNotFoundException;
import com.jewel.ecom.repository.OrderRepository;
import jakarta.validation.Valid;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class OrderServiceImpl  {

    private final OrderRepository repository;
    private OrderRepository userRepo;

    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }


}