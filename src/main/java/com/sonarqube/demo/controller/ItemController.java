package com.sonarqube.demo.controller;

import com.sonarqube.demo.entity.Item;
import com.sonarqube.demo.repos.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemRepository _itemRepository;

    @GetMapping
    public List<Item> getItems() {
        return _itemRepository.findAll();
    }

    @PostMapping
    public Item postItem(@RequestBody Item item) {
        return _itemRepository.save(item);
    }
}
