package com.example.pmsproject.repository;

import com.example.pmsproject.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository  extends JpaRepository<Property,Long> {
}
