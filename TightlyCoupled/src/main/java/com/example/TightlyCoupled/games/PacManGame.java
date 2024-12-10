package com.example.TightlyCoupled.games;

import com.example.TightlyCoupled.other.GameConsole;

public class PacManGame implements GameConsole {
    public void up(){
        System.out.println("Up pacman");
    }

    public void down(){
        System.out.println("down pacman");
    }

    public void right(){
        System.out.println("right pacman");
    }

    public void left(){
        System.out.println("left pacman");
    }
}
