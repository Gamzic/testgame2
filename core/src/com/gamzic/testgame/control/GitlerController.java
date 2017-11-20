package com.gamzic.testgame.control;
import com.badlogic.gdx.math.Polygon;

public class GitlerController {

    float rotationSpeed = 150f;
    private static Polygon gitlerBounds;

    public GitlerController(Polygon gitlerBounds) {
        GitlerController.gitlerBounds = gitlerBounds;
    }

    public void hahdle() {
    }


    public static Polygon getGitlerBounds() {
        return gitlerBounds;
   }
}