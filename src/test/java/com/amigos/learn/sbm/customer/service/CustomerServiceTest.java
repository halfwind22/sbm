package com.amigos.learn.sbm.customer.service;

import com.amigos.learn.sbm.config.SBMConfiguration;
import com.amigos.learn.sbm.customer.dao.CustomerRepoInterface;
import com.amigos.learn.sbm.customer.dao.CustomerRepository;
import com.amigos.learn.sbm.customer.entity.Customer;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@SpringJUnitConfig(classes = {SBMConfiguration.class})
class CustomerServiceTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerRepoInterface customerRepoInterface;
    private CustomerService customerServiceUnderTest;

    @BeforeEach
    void setUp() {
        customerServiceUnderTest = new CustomerService(customerRepoInterface);
        customerRepository.deleteAll();
    }


    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomers() {
        Customer customer1 = new Customer(1L, "Rahul", "Rahul123", "rahul@123.com");
        Customer customer2 = new Customer(1L, "Rahul1", "Rahul1232", "rahul2@123.com");
        customerRepository.saveAll(Arrays.asList(customer1, customer2));
        List<Customer> customers = customerServiceUnderTest.getCustomers();
        assertEquals(2, customers.size());

    }

    @Test
    void getCustomer() {
    }
}