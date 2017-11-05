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

    float speed, speedVelocity = 7f, speedMax = 15f;
    float rotationSpeed = 85f;

    public void hahdle() {
        //if (Gdx.input.isKeyPressed(Input.Keys.UP)) moveForward(); else downSpeed();


        if (Gdx.input.isKeyPressed(Input.Keys.UP)) moveForward(); else downSpeed();

        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) moveBack(); else downSpeed();




        //if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) moveBack(); else downSpeed();
       if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
       carBounds.rotate(rotationSpeed * GameScreen.deltaCff);
     }
      if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
       carBounds.rotate(-rotationSpeed* GameScreen.deltaCff);
    }

        sliseSpeed();
        carBounds.setPosition(carBounds.getX() + MathUtils.cosDeg(carBounds.getRotation()) * speed * GameScreen.deltaCff,
                carBounds.getY() + MathUtils.sinDeg(carBounds.getRotation()) * speed * GameScreen.deltaCff);

    }
    private void moveForward(){speed += speedVelocity*GameScreen.deltaCff;}
    private void moveBack(){speed -= speedVelocity*GameScreen.deltaCff;}


    private void downSpeed(){
        if (speed > speedVelocity * GameScreen.deltaCff) speed -= speedVelocity * GameScreen.deltaCff;
        else if (-speed < -speedVelocity * GameScreen.deltaCff) speed += speedVelocity * GameScreen.deltaCff;
        else speed = 0f;
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