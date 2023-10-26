package com.amigos.learn.sbm.customer.dao;

import com.amigos.learn.sbm.customer.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ActualCustomerRepositoryImpl implements CustomerRepoInterface {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomersFromRepository() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getCustomerFromRepository(Long customerId) {
        return customerRepository.findById(customerId);
    }
}
