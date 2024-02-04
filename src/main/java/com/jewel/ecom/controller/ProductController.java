package com.jewel.ecom.controller;

import com.jewel.ecom.api.ProductApi;

import static org.springframework.http.ResponseEntity.ok;

import com.jewel.ecom.api.model.Product;
import com.jewel.ecom.hateoas.ProductRepresentationModelAssembler;
import com.jewel.ecom.service.ProductService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController implements ProductApi {

    private final ProductService service;
    private final ProductRepresentationModelAssembler assembler;

    public ProductController(ProductService service, ProductRepresentationModelAssembler assembler) {
        this.service = service;
        this.assembler = assembler;
    }

    @Override
    public ResponseEntity<Product> getProduct(String id) {
        return service.getProduct(id).map(assembler::toModel).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<List<Product>> queryProducts(@Valid String tag, @Valid String name,
                                                       @Valid Integer page, @Valid Integer size) {
        return ok(assembler.toListModel(service.getAllProducts()));
    }
}