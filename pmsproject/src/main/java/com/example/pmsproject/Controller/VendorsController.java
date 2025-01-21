package com.example.pmsproject.Controller;


import com.example.pmsproject.Service.VendorsService;
import com.example.pmsproject.entity.Tenant;
import com.example.pmsproject.entity.Vendors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/vendors")
public class VendorsController {
     @Autowired
    private VendorsService vendorsService;

     @PostMapping
    public Vendors createVendors(@RequestBody Vendors vendors)
     {
         return  vendorsService.createVendors(vendors);
     }

     @GetMapping("/{id}")
    public Optional<Vendors> getVendorById(@PathVariable Long id)
     {
         return  vendorsService.getVendorsById(id);
     }
     @PutMapping("/{id}")
    public  Optional<Vendors> getVendorsById(@PathVariable Long id)
     {
         return  vendorsService.getVendorsById(id);
     }

     @DeleteMapping("/{id}")
    public  void deleteOwner(@PathVariable Long id)
     {
         vendorsService.deleteVendors(id);
     }
}
