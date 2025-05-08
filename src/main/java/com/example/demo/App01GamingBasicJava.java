package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
		
	}

}
