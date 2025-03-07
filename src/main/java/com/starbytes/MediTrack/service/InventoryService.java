package com.starbytes.MediTrack.service;

import com.starbytes.MediTrack.model.InventoryItems;
import com.starbytes.MediTrack.model.Supplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InventoryService {

    public InventoryItems add(InventoryItems inventoryItems);

    List<InventoryItems> getAllInventory();
}
