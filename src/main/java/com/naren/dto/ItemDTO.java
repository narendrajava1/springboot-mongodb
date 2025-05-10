package com.naren.dto;

import com.naren.model.Item;

import java.math.BigDecimal;
import java.util.List;

public record ItemDTO(String name, List<String> tags, BigDecimal price, int quantity) {
    public ItemDTO(Item i) {
        this(i.getName(), i.getTags(), i.getPrice(), i.getQuantity());
    }

    public Item toItem() {
        return new Item(name, tags, price, quantity);
    }
}
