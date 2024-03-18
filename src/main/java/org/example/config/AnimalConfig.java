package org.example.config;

import org.example.model.Cat;
import org.example.model.Dogs;
import org.example.model.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AnimalConfig {

    @Bean
    Cat getCat(){
        return new Cat();
    }

    @Bean
    Dogs getDogs(){
        return new Dogs();
    }
}
