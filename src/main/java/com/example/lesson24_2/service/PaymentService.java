package com.example.lesson24_2.service;

import com.example.lesson24_2.exceptions.NotEnoughtMoneyException;
import com.example.lesson24_2.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment(){
        throw new NotEnoughtMoneyException();
    }

}
