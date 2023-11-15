package com.amigos.learn.sbm.customer.dao;

import com.amigos.learn.sbm.customer.entity.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

public class FakeCustomerRepositoryImpl implements CustomerRepoInterface {
    @Override
    public List<Customer> getCustomersFromRepository() {
        return List.of(new Customer(1L, "JohnDoe", "456", "abc@gmail.com"), new Customer(2L, "FooBar", "123", "xyz@gmail.com"));

    }

    @Override
    public Optional<Customer> getCustomerFromRepository(Long customerId) {
        return Optional.of(new Customer(1L, "JohnDoe", "456", "abc@gmail.com"));
    }
}
