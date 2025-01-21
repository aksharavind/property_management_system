package com.example.pmsproject.Service;

import com.example.pmsproject.entity.Vendors;
import com.example.pmsproject.repository.VendorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class VendorsService {

    @Autowired
    private VendorsRepository vendorsRepository;

    public Vendors createVendors(Vendors vendors)
    {
        return  vendorsRepository.save(vendors);
    }
    public Optional<Vendors> getVendorsById(Long vendorsId)
    {
        return  vendorsRepository.findById(vendorsId);
    }
    public void deleteVendors(Long vendorsId)
    {
        vendorsRepository.deleteById(vendorsId);
    }
    public  Vendors  updateVendors(Vendors vendors)
    {
        return  vendorsRepository.save(vendors);
    }
}
