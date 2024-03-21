package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
-> The @Configuration annotation in Spring is used to indicate that a class contains one or more bean definitions.
-> When you annotate a class with @Configuration, Spring treats it as a source of bean definitions. It means that Spring will scan this class for
@Bean methods and register the beans defined by those methods in the application context.
 */
@Configuration
public class HelloWorldConfiguration {

    record Person (String name, int age){};

    record Address (String addressLine1, int zipCode){};


    @Bean
    public String name(){
        return  "Sakshi";
    }

    @Bean
    public int age(){
        return  20;
    }

    /*
     A record is a special kind of class primarily used to model data rather than behavior.
     It provides a compact way to declare classes that are transparent holders for immutable data.
     Records are often used for data transfer objects (DTOs), data entities, or simple data carriers.
     */
    @Bean
    public Person person(){
        return  new Person("Sakshi", 20);
    }

    @Bean
    public Address address(){
        return  new Address("Line 1", 1234);
    }
}
