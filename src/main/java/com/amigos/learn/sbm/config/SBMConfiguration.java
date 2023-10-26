package com.amigos.learn.sbm.config;

import com.amigos.learn.sbm.customer.dao.ActualCustomerRepositoryImpl;
import com.amigos.learn.sbm.customer.dao.CustomerRepoInterface;
import com.amigos.learn.sbm.customer.dao.FakeCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SBMConfiguration {

    @Value(value = "true")
    private boolean dbImplFlag;

    @Bean
    CustomerRepoInterface provideCustomerRepoInterface() {
        return dbImplFlag ? new ActualCustomerRepositoryImpl() : new FakeCustomerRepositoryImpl();
    }
}
