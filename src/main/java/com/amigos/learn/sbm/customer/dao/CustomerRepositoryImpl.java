package com.amigos.learn.sbm.customer.dao;

import com.amigos.learn.sbm.customer.entity.Customer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
@Primary
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> getCustomers() {
        return Collections.emptyList();
    }
}
