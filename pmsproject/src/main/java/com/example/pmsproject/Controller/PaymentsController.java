package com.example.pmsproject.Controller;


import com.example.pmsproject.Service.PaymentsService;
import com.example.pmsproject.entity.Owner;
import com.example.pmsproject.entity.Payments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/payments")
public class PaymentsController {
@Autowired
    private PaymentsService paymentsService;

@PostMapping
    public Payments generatePayments(@RequestBody Payments payments)
{
    return paymentsService .generatePayments(payments);
}




}
