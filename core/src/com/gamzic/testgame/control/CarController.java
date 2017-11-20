package com.gamzic.testgame.control;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.MathUtils;
import com.gamzic.testgame.control.GitlerController;
import com.badlogic.gdx.math.Polygon;
import com.gamzic.testgame.model.Gitler;
import com.gamzic.testgame.view.GameScreen;


public class CarController {
    private Polygon carBounds;

    public CarController(Polygon carBounds) {
        this.carBounds = carBounds;
    }

    float speed, speedVelocity = 5f, speedMax = 6f;
    float rotationSpeed = 20f;


    public void hahdle() {
        speed = sliseSpeed();
        if (carBounds.contains(GitlerController.getGitlerBounds().getX(), GitlerController.getGitlerBounds().getY()) ){
            System.out.println("EZZZZZZZZZZZZZ");
        }

        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            moveForward();
        } else if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            moveBack();
        } else downSpeed();

       if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
           carBounds.rotate(rotationSpeed * speed * GameScreen.deltaCff);
     }
      if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
       carBounds.rotate(-rotationSpeed * speed * GameScreen.deltaCff);
    }

        carBounds.setPosition(carBounds.getX() + MathUtils.cosDeg(carBounds.getRotation()) * speed * GameScreen.deltaCff,
                carBounds.getY() + MathUtils.sinDeg(carBounds.getRotation()) * speed * GameScreen.deltaCff);
        slicePosition();

    }
    private void moveForward(){speed += speedVelocity*GameScreen.deltaCff;}
    private void moveBack(){speed -= speedVelocity*GameScreen.deltaCff;}
    private void slicePosition(){
        if (carBounds.getY() > 3.322f) {
        carBounds.setPosition(carBounds.getX(), 3.322f);
        }
    if (carBounds.getY() < -4.145f) {
        carBounds.setPosition(carBounds.getX(), -4.144f);
    }
    if (carBounds.getX() > 6.477f) {
        carBounds.setPosition(6.477f, carBounds.getY());
    }
    if (carBounds.getX() < -7.98f) {
        carBounds.setPosition(-7.98f, carBounds.getY());
    }

}
    private void downSpeed(){
        if (speed > speedVelocity * GameScreen.deltaCff) speed -= speedVelocity * GameScreen.deltaCff;
        else if (speed < -speedVelocity * GameScreen.deltaCff) speed += speedVelocity * GameScreen.deltaCff;
        else speed = 0f;
        }
    private float sliseSpeed() {
        if (speed > speedMax) {
            return speedMax;
        }
        if (speed < -speedMax) {
            return -speedMax;
        }
        return speed;
    }
}