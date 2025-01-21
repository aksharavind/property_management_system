package com.example.pmsproject.Service;


import com.example.pmsproject.entity.Payments;
import com.example.pmsproject.repository.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentsService {
    @Autowired

    private PaymentsRepository paymentsRepository;
    public Payments generatePayments(Payments payments)
    {
      return  paymentsRepository.save(payments);
    }

}
