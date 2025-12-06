package com.minijava.service.impl;

import com.minijava.dto.ItemDTO;
import com.minijava.repository.ItemRepository;
import com.minijava.repository.ItemRepositoryInterface;
import com.minijava.service.ItemAddService;

import java.util.List;

public class ItemAddServiceImpl implements ItemAddService {
    private final ItemRepositoryInterface itemRepository;

    public ItemAddServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    @Override
    public int itemAdd(String name, String rank, String quality, int power) {
        // 이름 중복 아이템 처리
        List<ItemDTO> byName = itemRepository.findByName(name);
        if(byName.isEmpty()){
            System.out.println("이름이 중복됩니다. 아이템을 다시 등록해주세요.");
            for (ItemDTO itemDTO : byName) {
                System.out.println("중복되는 아이템 정보 => "+itemDTO);
            }
            return 0;
        }
        // 아이템 정상 등록
        int newItemNumber = itemRepository.getLastItemNumber() + 1;
        itemRepository.save(new ItemDTO(newItemNumber, name, rank, quality, power));
        return newItemNumber;
    }
}
