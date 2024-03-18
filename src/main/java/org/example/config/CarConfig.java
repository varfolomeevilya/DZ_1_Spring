package org.example.config;

import org.example.model.Audi;
import org.example.model.Hyundai;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CarConfig {


    @Bean
    Hyundai getHyundai(){
     return new Hyundai();
    }

    @Bean
    //    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Scope("prototype")
    Audi getAudi(){
        return  new Audi();
    }
}
