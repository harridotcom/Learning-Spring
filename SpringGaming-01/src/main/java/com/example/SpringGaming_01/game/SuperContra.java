package com.example.SpringGaming_01.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
//@Primary
public class SuperContra implements GameConsole {

    public void up() {
        System.out.println("SuperContra moving up");
    }

    public void down() {
        System.out.println("SuperContra moving down");
    }

    public void left() {
        System.out.println("SuperContra moving left");
    }

    public void right() {
        System.out.println("SuperContra moving right");
    }
}
