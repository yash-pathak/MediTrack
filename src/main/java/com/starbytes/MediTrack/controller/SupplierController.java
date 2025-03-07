package com.starbytes.MediTrack.controller;


import com.starbytes.MediTrack.model.Supplier;
import com.starbytes.MediTrack.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @PostMapping("/add")
    public Supplier addSupplier(@RequestBody Supplier supplier){
        return supplierService.add(supplier);
    }

    @GetMapping("/getAllSuppliers")
    public List<Supplier> getAllSuppliers(){
        List<Supplier> suppliers=supplierService.findAllSuppliers();
        return suppliers;
    }
}
