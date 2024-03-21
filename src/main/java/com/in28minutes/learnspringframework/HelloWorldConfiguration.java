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

    @Bean
    public String name(){
        return  "Sakshi";
    }

    @Bean
    public int age(){
        return  20;
    }
}
