package com.minijava.service.impl;

import com.minijava.dto.ItemDTO;
import com.minijava.repository.ItemRepository;
import com.minijava.service.ItemAddService;

public class ItemAddServiceImpl implements ItemAddService {
    final ItemRepository itemRepository;
    ItemAddServiceImpl(ItemRepository itemRepository){
        this.itemRepository=itemRepository;
    }


    @Override
    public int itemAdd(String name, String rank, String quality, int power) {

        return 0;
    }
}
