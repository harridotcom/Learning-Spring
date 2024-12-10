package com.example.SpringGaming_01.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GameConsole game;

    public GameRunner(@Qualifier("pacman") GameConsole game){
        this.game = game;
    }

    public void run(){
        System.out.println("running" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
