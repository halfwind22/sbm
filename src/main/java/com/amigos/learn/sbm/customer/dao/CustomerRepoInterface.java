package com.amigos.learn.sbm.customer.dao;

import com.amigos.learn.sbm.customer.entity.Customer;

import java.util.List;
import java.util.Optional;


public interface CustomerRepoInterface {

    public List<Customer> getCustomersFromRepository();

    public Optional<Customer> getCustomerFromRepository(Long customerId);
}
