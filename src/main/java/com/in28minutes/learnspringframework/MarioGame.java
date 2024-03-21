package com.in28minutes.learnspringframework;

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
