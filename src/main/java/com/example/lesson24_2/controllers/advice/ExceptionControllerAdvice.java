package com.example.lesson24_2.controllers.advice;

import com.example.lesson24_2.exceptions.NotEnoughtMoneyException;
import com.example.lesson24_2.model.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughtMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler(){
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not money");
        return ResponseEntity.badRequest().body(errorDetails);
    }

}
