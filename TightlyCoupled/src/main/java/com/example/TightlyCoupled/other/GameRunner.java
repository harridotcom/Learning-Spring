package com.example.TightlyCoupled.other;

import com.example.TightlyCoupled.games.PacManGame;
import com.example.TightlyCoupled.games.SuperContra;

public class GameRunner {
    GameConsole gameConsole;

    public GameRunner(GameConsole game){
        this.gameConsole = game;
    }

    public void run(){
        System.out.println("running " + gameConsole);
        gameConsole.up();
        gameConsole.down();
        gameConsole.left();
        gameConsole.right();
    }
}
