package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
It creates an instance of AnnotationConfigApplicationContext and passes HelloWorldConfiguration.class
as an argument to its constructor. This tells Spring to scan the HelloWorldConfiguration class for bean definitions.
It then retrieves the bean named "name" from the Spring application context using context.getBean("name").
Finally, it prints the value of the "name" bean to the console.
 */

/*
-> Dependency Injection (DI) is a design pattern used to achieve loose coupling between classes and their dependencies.
-> Dependency Injection is a technique used to provide the necessary dependencies to a class from the outside rather than
having the class create them itself.
 */
public class HelloWorldSpringConfiguration {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
    }
}
