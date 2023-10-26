package com.amigos.learn.sbm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbmApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SbmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from Spring Boot Masterclass application");
    }
}
