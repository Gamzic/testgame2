package com.gamzic.testgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.gamzic.testgame.view.GameScreen;

public class Main extends Game {
private Screen gameScreen;
	@Override
	public void create() {
		gameScreen = new GameScreen();
		setScreen(gameScreen);
	}


}

