package com.example.SpringGaming_01.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pacman")
public class PacMan implements GameConsole{

    public void up() {
        System.out.println("PacMan moving up");
    }

    public void down() {
        System.out.println("PacMan moving down");
    }

    public void left() {
        System.out.println("PacMan moving left");
    }

    public void right() {
        System.out.println("PacMan moving right");
    }
}
