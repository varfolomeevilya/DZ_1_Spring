package org.example.model;

import org.springframework.stereotype.Component;

@Component
public class Cow extends Animal{

    @Override
    public void getSay(){
        System.out.println("MU");
    }
}
