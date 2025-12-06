package com.minijava.service.impl;

import com.minijava.repository.ItemRepository;

public class ItemAddService implements com.minijava.service.ItemAddService {
    ItemRepository itemRepository;
    ItemAddService(ItemRepository itemRepository){
        this.itemRepository=itemRepository;
    }
}
