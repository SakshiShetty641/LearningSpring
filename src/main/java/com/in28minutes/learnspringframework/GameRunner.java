package com.in28minutes.learnspringframework;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    GamingConsole gamingConsole;

    public GameRunner(GamingConsole gamingConsole) {
        this.gamingConsole = gamingConsole;
    }

    public void run() {
        System.out.println("Game Runner class ");
        gamingConsole.goLeft();
        gamingConsole.goRight();
        gamingConsole.goStraight();

    }
}
