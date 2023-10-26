package com.amigos.learn.sbm.customer.controller;

import com.amigos.learn.sbm.customer.entity.Customer;
import com.amigos.learn.sbm.customer.exception.CustomerNotFoundException;
import com.amigos.learn.sbm.customer.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    @Autowired
    private final CustomerService customerService;

    @GetMapping
    List<Customer> getListOfCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomerById(@PathVariable Long customerId) {
        return customerService.getCustomer(customerId);
    }

    @PostMapping(path = "/create")
    public Customer createCustomer(@RequestBody @Valid Customer customer) {
        return customer;
    }


}
