package com.example.pmsproject.Service;


import com.example.pmsproject.entity.Tenant;
import com.example.pmsproject.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TenantService {
    @Autowired
    private TenantRepository tenantRepository;
    public Tenant createTenant(Tenant tenant)
    {
        return  tenantRepository.save(tenant);
    }
    public Optional<Tenant> getTenantById(Long tenatId)
    {
        return  tenantRepository.findById(tenatId);
    }
    public  void  deleteTenant(Long tenantId)
    {
        tenantRepository.deleteById(tenantId);
    }
    public  Tenant updateTenant(Tenant tenant)
    {
        return tenantRepository.save(tenant);
    }

}
