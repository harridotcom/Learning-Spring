package com.example.TightlyCoupled;

import com.example.TightlyCoupled.games.PacManGame;
import com.example.TightlyCoupled.games.SuperContra;
import com.example.TightlyCoupled.other.GameConsole;
import com.example.TightlyCoupled.other.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TightlyCoupledApplication {

	public static void main(String[] args) {

		PacManGame pg = new PacManGame();
		SuperContra sg = new SuperContra();

		GameRunner gr = new GameRunner(sg);

		gr.run();

	}

}
