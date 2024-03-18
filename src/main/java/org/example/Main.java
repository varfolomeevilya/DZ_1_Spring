package org.example;

import org.example.config.CarConfig;
import org.example.model.Audi;
import org.example.model.Hyundai;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);

        Audi audi = context.getBean(Audi.class);
        Audi audi1 = context.getBean(Audi.class);

        Hyundai hyundai = context.getBean(Hyundai.class);
        Hyundai hyundai1 = context.getBean(Hyundai.class);

        System.out.println("Audi is" + (audi == audi1 ? "Singleton" : "Prototype")); // Audi is Prototype
        System.out.println("Hyundia is" + (hyundai == hyundai1 ? "Singleton" : "Prototype")); // Hyundai is Singleton

        context.close();
    }
}
