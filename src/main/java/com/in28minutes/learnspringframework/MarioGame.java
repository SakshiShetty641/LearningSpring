package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
/*
The @Component annotation is a fundamental annotation in the Spring Framework used to mark a Java class as a Spring-managed component.
When you annotate a class with @Component, Spring automatically detects and registers it as a Spring bean in the application context.
 */
public class MarioGame implements GamingConsole{

    public void goRight(){
        System.out.println("Going Right");
    }

    public void goLeft(){
        System.out.println("Going Left");
    }

    public void goStraight(){
        System.out.println("Going Straight");
    }

    @Override
    public void goDown() {
        System.out.println("Going Down");
    }


}
