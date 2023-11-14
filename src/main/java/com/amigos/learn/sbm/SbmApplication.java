package com.amigos.learn.sbm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SbmApplication implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("Hello hello");
        SpringApplication.run(SbmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from Spring Boot Masterclass application");
    }
}
