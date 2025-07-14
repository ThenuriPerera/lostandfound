package com.example.lostandfound.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ItemService {
    public Item createItem(Item item) {
        log.info("Creating item: {}", item.getName());
        return itemRepository.save(item);
    }
}
