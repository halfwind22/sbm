package com.amigos.learn.sbm.customer.dao;

import com.amigos.learn.sbm.customer.entity.Customer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("fake")
public class FakeCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> getCustomers() {
        return List.of(new Customer(1L, "JohnDoe", "456","abc@gmail.com"), new Customer(2L, "FooBar", "123","xyz@gmail.com"));
    }
}
