package com.example.pmsproject.repository;

import com.example.pmsproject.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OwnerRepository extends JpaRepository<Owner ,Long> {


    @Query(value = "SELECT * FROM owner WHERE owner_username = ?1", nativeQuery = true)
    Owner findByOwnerUsername(String ownerUsername);

}
