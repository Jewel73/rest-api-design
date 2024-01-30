package com.jewel.ecom.service;

import com.jewel.ecom.api.model.Item;
import com.jewel.ecom.entity.ItemEntity;

import java.util.List;

public interface ItemService {

    ItemEntity toEntity(Item m);

    List<ItemEntity> toEntityList(List<Item> items);

    Item toModel(ItemEntity e);

    List<Item> toModelList(List<ItemEntity> items);
}