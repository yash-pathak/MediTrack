package com.starbytes.MediTrack.service.impl;

import com.starbytes.MediTrack.model.Supplier;
import com.starbytes.MediTrack.repository.SupplierRepository;
import com.starbytes.MediTrack.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SupplierRepository supplierRepository;

    @Override
    public Supplier add(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public List<Supplier> findAllSuppliers() {
        return supplierRepository.findAll();
    }


}
