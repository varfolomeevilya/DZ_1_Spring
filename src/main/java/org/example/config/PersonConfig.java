package org.example.config;


import org.example.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean
    Person getPerson(){
        return new Person();
    }
}
