package com.starbytes.MediTrack.controller;

import com.starbytes.MediTrack.model.InventoryItems;
import com.starbytes.MediTrack.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @PostMapping("/addInventory")
    public InventoryItems add(@RequestBody InventoryItems inventoryItems){
        return inventoryService.add(inventoryItems);
    }

    @GetMapping("/getAllInventory")
    public List<InventoryItems> getAllInventory(){
        return inventoryService.getAllInventory();

    }



}
