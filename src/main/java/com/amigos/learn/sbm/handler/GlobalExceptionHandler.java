package com.amigos.learn.sbm.handler;

import com.amigos.learn.sbm.customer.exception.ApiException;
import com.amigos.learn.sbm.customer.exception.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.ZonedDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<Object> handleCustomerNotFoundException(CustomerNotFoundException customerNotFoundException) {
        return new ResponseEntity<Object>(new ApiException(customerNotFoundException.getMessage(), customerNotFoundException, HttpStatus.NOT_FOUND, ZonedDateTime.now())
                , HttpStatus.NOT_FOUND);
    }
}


