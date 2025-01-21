package com.example.pmsproject.Service;


import com.example.pmsproject.entity.Owner;
import com.example.pmsproject.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OwnerService {
 @Autowired
    private OwnerRepository ownerRepository;

 public  Owner  createOwner(Owner owner)
 {
     return ownerRepository.save(owner);
 }
 public Optional<Owner> getOwnerById(Long ownerId)
 {
     return  ownerRepository.findById(ownerId);
 }
  public void deleteOwner(Long ownerId)
  {
      ownerRepository.deleteById(ownerId);s
  }
  public  Owner updateOwner(Owner owner)
  {
      return  ownerRepository.save(owner);
  }
    public Owner getOwnerByUsername(String ownerUsername) {
        return ownerRepository.findByOwnerUsername(ownerUsername);
    }
}
