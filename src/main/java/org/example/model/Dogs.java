package org.example.model;

import org.springframework.stereotype.Component;

@Component("dogs")
public class Dogs extends Animal {


    @Override
    public void getSay(){
        System.out.println("Bark");
    }
}
