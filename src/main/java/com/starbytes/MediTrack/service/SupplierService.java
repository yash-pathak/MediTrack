package com.starbytes.MediTrack.service;

import com.starbytes.MediTrack.model.Supplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupplierService {

    public Supplier add(Supplier supplier);

    List<Supplier> findAllSuppliers();
}
