package com.example.pmsproject.Controller;


import com.example.pmsproject.Service.PropertyService;
import com.example.pmsproject.entity.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Property")
public class PropertyController {
    @Autowired
    private PropertyService propertyService;

    @PostMapping
    public Property addProperty(@RequestBody Property property)
    {
        return  propertyService.addProperty(property);
    }

    @GetMapping("/{id}")
    public Optional<Property> getPropertyById(@PathVariable Long id)
    {
        return  propertyService.getpropertyByID(id);
    }

    @PutMapping("/{id}")
    public Property updateProperty(@PathVariable Long id,@RequestBody Property property )
    {
        property.setPropertyId(id);
        return  propertyService.updateProperty(property);
    }

    @DeleteMapping("/{id}")
    public void  deleteProperty(@PathVariable Long id)
    {
        propertyService.deleteProperty(id);
    }
}
