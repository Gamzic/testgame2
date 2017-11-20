package com.gamzic.testgame.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gamzic.testgame.control.GitlerController;

public class Gitler extends GameObject {


    private GitlerController gitlerController;

    public Gitler(Texture texture, float x, float y, float width, float height) {
        super(texture, x, y, width, height);
        gitlerController = new GitlerController(bounds);
    }
    @Override
    public void draw(SpriteBatch batch) {
        super.draw(batch);
        gitlerController.hahdle();
    }
}