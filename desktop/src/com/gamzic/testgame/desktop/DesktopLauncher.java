package com.gamzic.testgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gamzic.testgame.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		System.setProperty("user.name","Public");
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();


		config.width = 854;
		config.height = 480;
		new LwjglApplication(new Main(), config);
	}
}
