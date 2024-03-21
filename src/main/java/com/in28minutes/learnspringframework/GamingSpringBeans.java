package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("package com.in28minutes.learnspringframework")
public class GamingSpringBeans {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

        context.getBean(GamingConsole.class).goLeft();
    }
}
