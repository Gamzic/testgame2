package com.gamzic.testgame.model;

import com.badlogic.gdx.graphics.Texture;
import com.gamzic.testgame.control.TazController;

public class Taz extends GameObject {
    private TazController tazController;
    public Taz(Texture texture, float x, float y, float width, float height) {
        super(texture, x, y, width, height);
    }


}
