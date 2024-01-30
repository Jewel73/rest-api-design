package com.jewel.ecom.service;

import com.jewel.ecom.api.model.Item;
import com.jewel.ecom.entity.ItemEntity;
import com.jewel.ecom.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    @Override
    public ItemEntity toEntity(Item m) {
        ItemEntity e = new ItemEntity();
        e.setProduct(new ProductEntity().setId(UUID.fromString(m.getId())))
                .setPrice(m.getUnitPrice())
                .setQuantity(m.getQuantity());
        return e;
    }

    @Override
    public List<ItemEntity> toEntityList(List<Item> items) {
        if (Objects.isNull(items)) {
            return List.of();
        }
        return items.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public Item toModel(ItemEntity e) {
        Item m = new Item();
        m.id(e.getProduct().getId().toString()).unitPrice(e.getPrice()).quantity(e.getQuantity());
        return m;
    }

    @Override
    public List<Item> toModelList(List<ItemEntity> items) {
        if (Objects.isNull(items)) {
            return List.of();
        }
        return items.stream().map(this::toModel).collect(Collectors.toList());
    }
}