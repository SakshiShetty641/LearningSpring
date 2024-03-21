package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
The @Configuration annotation is used in Spring to indicate that a class declares one or more @Bean methods.
These @Bean methods are responsible for instantiating, configuring, and returning objects that are managed by the Spring IoC (Inversion of Control) container.


 */
public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        return new MarioGame();
    }

}
