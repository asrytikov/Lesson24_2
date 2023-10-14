package com.example.lesson24_2.controllers;

import com.example.lesson24_2.exceptions.NotEnoughtMoneyException;
import com.example.lesson24_2.model.ErrorDetails;
import com.example.lesson24_2.model.PaymentDetails;
import com.example.lesson24_2.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

    private static Logger logger = Logger.getLogger(PaymentController.class.getName());

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

   /* @PostMapping("/payment")
    public ResponseEntity<?> makePayment(){
            PaymentDetails paymentDetails = paymentService.processPayment();
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentDetails);
    }*/

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(
            @RequestBody PaymentDetails paymentDetails
    ){
        logger.info("Received payment " + paymentDetails.getAmount());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentDetails);
    }


}
