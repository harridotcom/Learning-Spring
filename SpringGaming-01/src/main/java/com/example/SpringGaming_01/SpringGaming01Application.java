package com.example.SpringGaming_01;

import com.example.SpringGaming_01.game.GameConsole;
import com.example.SpringGaming_01.game.GameRunner;
import com.example.SpringGaming_01.game.PacMan;
import com.example.SpringGaming_01.game.SuperContra;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
@Configuration
@ComponentScan("com.example.SpringGaming_01.game")
public class SpringGaming01Application {

//	@Bean
//	@Primary
//	public GameConsole pacman(){
//		return new PacMan();
//	}

//	@Bean
//	@Qualifier("super")
//	public GameConsole superContra(){
//		return new SuperContra();
//	}

//	@Bean
//	public GameRunner gameRunner(GameConsole gameConsole){
//		return new GameRunner(gameConsole);
//	}

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(SpringGaming01Application.class);
		context.getBean(GameRunner.class).run();
	}

}
