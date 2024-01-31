package com.jewel.ecom.controller;

import com.jewel.ecom.api.CartApi;
import com.jewel.ecom.api.model.Cart;
import com.jewel.ecom.api.model.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartsController implements CartApi {
    Logger log = LoggerFactory.getLogger(CartsController.class);

    @Override
    public ResponseEntity<List<Item>> addCartItemsByCustomerId(String customerId, Item item) throws Exception {
        log.info("Request for customer ID: {} \nItem: {}", customerId, item);
        return CartApi.super.addCartItemsByCustomerId(customerId, item);
    }

    @Override
    public ResponseEntity<Cart> getCartByCustomerId(String customerId) {
        throw new RuntimeException("Manual exception thrown");
    }
}
