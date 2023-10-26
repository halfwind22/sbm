package com.amigos.learn.sbm.customer.service;

import com.amigos.learn.sbm.customer.dao.CustomerRepository;
import com.amigos.learn.sbm.customer.entity.Customer;
import com.amigos.learn.sbm.customer.exception.CustomerNotFoundException;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CustomerService {

    @Autowired
    @Qualifier("fake")
    private final CustomerRepository repository;

    public List<Customer> getCustomers() {
        return repository.getCustomers();
    }

    public Customer getCustomer(Long customerId) {
        return getCustomers()
                .stream()
                .filter(customer -> customer.getId().equals(customerId))
                .findFirst()
                .orElseThrow(() -> new CustomerNotFoundException("Requested customer with customerId: " + customerId + " was not found")
                );
    }
}
