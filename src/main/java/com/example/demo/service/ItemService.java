// File: ItemService.java
package com.example.demo.service;

import com.example.demo.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private final List<Item> itemList = new ArrayList<>();

    public ItemService() {
        itemList.add(new Item("Apple"));
        itemList.add(new Item("Banana"));
        itemList.add(new Item("Cherry"));
    }

    public List<Item> getItems() {
        return itemList;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }
}
