package com.amigos.learn.sbm.customer.dao;

import com.amigos.learn.sbm.customer.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CustomerRepository {

    public List<Customer> getCustomers();
}
