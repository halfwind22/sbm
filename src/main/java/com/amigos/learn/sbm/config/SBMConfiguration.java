package com.amigos.learn.sbm.config;

import com.amigos.learn.sbm.customer.dao.ActualCustomerRepositoryImpl;
import com.amigos.learn.sbm.customer.dao.CustomerRepoInterface;
import com.amigos.learn.sbm.customer.dao.FakeCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@EnableAutoConfiguration
public class SBMConfiguration {

    @Value(value = "true")
    private boolean dbImplFlag;

    @Value(value = "${info.app.description}")
    private String description;

    @Bean
    CustomerRepoInterface customerRepoInterface() {
        return dbImplFlag ? new ActualCustomerRepositoryImpl() : new FakeCustomerRepositoryImpl();
    }
}
