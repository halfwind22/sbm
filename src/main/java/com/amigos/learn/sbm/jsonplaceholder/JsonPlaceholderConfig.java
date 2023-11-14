package com.amigos.learn.sbm.jsonplaceholder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class JsonPlaceholderConfig {

    @Autowired
    JsonPlaceHolderClient jsonPlaceHolderClient;

    @Bean
    CommandLineRunner provideRunnerCommands() {
        /*
        * Equivalent to :
        * @Bean
        * public CommandLineRunner getRunner(){
        * new Runner({
            @Override
            public void run(String... args) throws Exception {

                System.out.println(jsonPlaceHolderClient.getPosts());
                System.out.println(jsonPlaceHolderClient.getPost(1));

            });
        * )
        *
        * Or , since CommandLineRunner is a functional interface,
        * CommandLineRunner runner = (args)-> {

            System.out.println(jsonPlaceHolderClient.getPosts());
            System.out.println(jsonPlaceHolderClient.getPost(1));

        };
        *
        * The runner object has to be annotated with a @Bean to enable the Spring DI container and Spring Core
        * to detect it as a bean and execute it automatically at startup.And @Bean can be applied only on a method
        * So approach 2 won't work.
        * Approach1 will work, but need injection of the CommandLineRunner as a dependency in the main application, and then
        * invoking run() of that dependency within the run() of the main App (Since we need to extend CommandLineRunner interface
        * Lots of work, so do easy stuff :P
        *
        * */

        return args -> {
            System.out.println(jsonPlaceHolderClient.getPosts().size());
            System.out.println(jsonPlaceHolderClient.getPost(1));

        };
    }
}
