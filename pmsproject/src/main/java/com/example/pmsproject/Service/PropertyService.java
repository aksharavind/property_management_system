package com.example.pmsproject.Service;


import com.example.pmsproject.entity.Owner;
import com.example.pmsproject.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

     @Autowired

    private PropertyRepository propertyRepository;


}
