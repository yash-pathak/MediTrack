package com.starbytes.MediTrack.repository;

import com.starbytes.MediTrack.model.InventoryItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryItems,Long> {
}
