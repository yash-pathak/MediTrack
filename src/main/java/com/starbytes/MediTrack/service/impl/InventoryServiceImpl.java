package com.starbytes.MediTrack.service.impl;

import com.starbytes.MediTrack.model.InventoryItems;
import com.starbytes.MediTrack.model.Supplier;
import com.starbytes.MediTrack.repository.InventoryRepository;
import com.starbytes.MediTrack.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;
    @Override
    public InventoryItems add(InventoryItems inventoryItems) {
        return inventoryRepository.save(inventoryItems);
    }

    @Override
    public List<InventoryItems> getAllInventory() {
        return inventoryRepository.findAll();
    }

}
