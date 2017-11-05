package com.gamzic.testgame.control;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Polygon;
import com.gamzic.testgame.view.GameScreen;


public class CarController {
    private Polygon carBounds;

    public CarController(Polygon carBounds) {
        this.carBounds = carBounds;
    }

    float speed, velocity = 0.02f, speedMax = 3f;
    public void hahdle() {
        speed = sliseSpeed();


        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            speed +=velocity;
            carBounds.setPosition(carBounds.getX() + MathUtils.cosDeg(carBounds.getRotation()) * speed * GameScreen.deltaCff,
                    carBounds.getY() + MathUtils.sinDeg(carBounds.getRotation()) * speed * GameScreen.deltaCff);
        } else {speed -= velocity;}

        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            carBounds.setPosition(carBounds.getX() - MathUtils.cosDeg(carBounds.getRotation() * speed) * GameScreen.deltaCff,
                    carBounds.getY() - MathUtils.sinDeg(carBounds.getRotation() * speed) * GameScreen.deltaCff);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            carBounds.rotate(170f * GameScreen.deltaCff);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            carBounds.rotate(-170f* GameScreen.deltaCff);
        }


    }

    private float sliseSpeed() {
        if (speed > speedMax) {
            return speedMax;
        }
        if (speed < -speedMax) {
            return speedMax;
        }
        return speed;
    }
}