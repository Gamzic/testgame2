package com.gamzic.testgame.control;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Polygon;
import com.gamzic.testgame.view.GameScreen;


public class CarController {
    private Polygon carBounds;
    public CarController(Polygon carBounds){
        this.carBounds = carBounds;
    }


    public void hahdle(){
        float speed = 0.3f;
        carBounds.rotate(-2f);
        carBounds.setPosition(carBounds.getX() + MathUtils.cosDeg(carBounds.getRotation() * speed * GameScreen.deltaCff),
                carBounds.getY() + MathUtils.sinDeg(carBounds.getRotation() * speed * GameScreen.deltaCff));

    }
}
