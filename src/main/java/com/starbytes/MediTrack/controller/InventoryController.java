package com.starbytes.MediTrack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    
    @GetMapping("/test")
    public String test(){
        return "test";
    }

}
