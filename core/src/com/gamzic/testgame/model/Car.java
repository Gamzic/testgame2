package com.gamzic.testgame.model;

import com.badlogic.gdx.graphics.Texture;
import com.gamzic.testgame.control.CarController;

public class Car extends GameObject {
    private CarController carController;
    public Car(Texture texture, float x, float y, float width, float height) {
        super(texture, x, y, width, height);
        }
    }

