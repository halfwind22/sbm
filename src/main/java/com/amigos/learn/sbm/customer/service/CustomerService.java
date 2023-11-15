package com.amigos.learn.sbm.customer.service;

import ch.qos.logback.classic.Logger;
import com.amigos.learn.sbm.customer.dao.CustomerRepoInterface;
import com.amigos.learn.sbm.customer.dao.CustomerRepository;
import com.amigos.learn.sbm.customer.entity.Customer;
import com.amigos.learn.sbm.customer.exception.CustomerNotFoundException;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CustomerService {

    @Autowired
    private final CustomerRepoInterface customerRepoInterface;

    public List<Customer> getCustomers() {
        return customerRepoInterface.getCustomersFromRepository();
    }

    public Customer getCustomer(Long customerId) {
        return customerRepoInterface
                .getCustomerFromRepository(customerId)
                .orElseThrow(() -> new CustomerNotFoundException("Requested customer with customerId: " + customerId + " was not found")
                );
    }
}
