package com.example.pmsproject.Controller;


import com.example.pmsproject.Service.TenantService;
import com.example.pmsproject.entity.Owner;
import com.example.pmsproject.entity.Tenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/tenants")
public class TenantController {
    @Autowired
    private TenantService tenantService;

    @PostMapping
    public  Tenant createTenant(@RequestBody Tenant tenant)
    {
        return tenantService.createTenant(tenant);
    }

    @GetMapping("/{id}")
    public Optional<Tenant> getTenantById(@PathVariable Long id)
    {
        return  tenantService.getTenantById(id);
    }
     @PutMapping("{id}")
    public  Tenant updateTenant(@PathVariable Long id,@RequestBody Tenant tenant)
     {
         tenant.setTenantId(id);
         return  tenantService.updateTenant(tenant);
     }

     @DeleteMapping("/{id}")
     public  void  deleteTenant(@PathVariable Long id)
     {
         tenantService.deleteTenant(id);
     }

}
