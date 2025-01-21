package com.example.pmsproject.Service;


import com.example.pmsproject.entity.Owner;
import com.example.pmsproject.entity.Property;
import com.example.pmsproject.repository.PropertyRepository;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PropertyService {

     @Autowired

    private PropertyRepository propertyRepository;

     public Property  addProperty(Property property)
     {
         return  propertyRepository.save(property);
     }

     public Optional<Property> getpropertyByID(Long propertyID)
     {
         return   propertyRepository.findById(propertyID);
     }
     public  void deleteProperty(Long propertyId)
     {
         propertyRepository.deleteById(propertyId);
     }
     public  Property updateProperty(Property property)
     {
         return  propertyRepository.save(property);
     }

}
