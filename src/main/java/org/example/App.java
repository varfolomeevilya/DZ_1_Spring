package org.example;


import org.example.config.PersonConfig;
import org.example.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
        Person person = context.getBean(Person.class);
        person.sayHello();
       context.close();

    }
}
