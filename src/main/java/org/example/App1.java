package org.example;

import org.example.config.AnimalConfig;
import org.example.model.Animal;
import org.example.model.Cow;
import org.example.model.Dogs;
import org.example.model.Pet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {
    public static void main (String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfig.class);

        Animal cat = context.getBean(Animal.class);
        cat.getSay();

        Animal dogs = context.getBean( Dogs.class);
        dogs.getSay();

        Pet pet = context.getBean("pet", Pet.class);
        pet.say();
        Cow cow = context.getBean("cow", Cow.class);
        cow.getSay();
    }
}
