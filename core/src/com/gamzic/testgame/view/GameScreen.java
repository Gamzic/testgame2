package com.gamzic.testgame.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gamzic.testgame.model.Car;
import com.gamzic.testgame.model.Gitler;
import com.gamzic.testgame.model.Taz;

public class GameScreen implements Screen {

    private Texture gitlerTexture;
    private Texture tazTexture;
    private SpriteBatch batch;
    private Taz taz;
    private Car car;
    private Gitler gitler;
    private OrthographicCamera camera;
    private Texture carTexture;
    public static float deltaCff;





    @Override
    public void show() {
batch = new SpriteBatch();
tazTexture = new Texture(Gdx.files.internal("taz.png"));
gitlerTexture= new Texture(Gdx.files.internal("gitler.png"));
gitlerTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
carTexture = new Texture(Gdx.files.internal("car.png"));
carTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);

gitler = new Gitler(gitlerTexture, 0, 0, 1f,1f * 1.64f);
taz = new Taz(tazTexture, 0, 0, 1f, 1f * 1f);
car = new Car(carTexture, 0, 0 ,1.5f, 1.5f * 0.54f);

    }



    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        deltaCff = delta;
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        car.draw(batch);
        gitler.draw(batch);
        batch.end();


    }

    @Override
    public void resize(int width, int height) {
        float aspectRatio = (float) height/width;
        camera = new OrthographicCamera(20f,20f * aspectRatio);
       // camera.setToOrtho();
        camera.zoom = 0.8f;
        camera.update();


    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        tazTexture.dispose();
    batch.dispose();
    }
}
