package com.example.pmsproject.Controller;
//package com.example.pmsproject.Controller;

import com.example.pmsproject.Service.OwnerService;
import com.example.pmsproject.entity.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/owners")
public class OwnerController {
    @Autowired
    private OwnerService ownerService;

    @PostMapping
    public Owner createOwner(@RequestBody Owner owner) {
        return ownerService.createOwner(owner);
    }

    @GetMapping("/{id}")
    public Optional<Owner> getOwnerById(@PathVariable Long id) {
        return ownerService.getOwnerById(id);
    }

    @PutMapping("/{id}")
    public Owner updateOwner(@PathVariable Long id, @RequestBody Owner owner) {
        owner.setOwnerId(id);
        return ownerService.updateOwner(owner);
    }

    @DeleteMapping("/{id}")
    public void deleteOwner(@PathVariable Long id) {
        ownerService.deleteOwner(id);
    }
    @GetMapping("/username/{ownerUsername}")
    public Owner getOwnerByUsername(@PathVariable String ownerUsername) {
        return ownerService.getOwnerByUsername(ownerUsername);
    }

}
