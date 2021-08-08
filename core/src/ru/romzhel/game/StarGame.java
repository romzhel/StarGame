package ru.romzhel.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class StarGame extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture img;
    private Texture backgroundImg;
    private int x = 0;
    private final int IMAGE_SIDE_SIZE = 256;

    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("images/badlogic.jpg");
        backgroundImg = new Texture("images/tumannost-zvezdy-kosmos.jpg");
    }

    @Override
    public void render() {
        int screenWidth = Gdx.graphics.getWidth();
        int screenHeight = Gdx.graphics.getHeight();

        ScreenUtils.clear(1, 0, 0, 1);
        batch.begin();
        batch.draw(backgroundImg, 0, 0, screenWidth, screenHeight);

        if (x > screenWidth - IMAGE_SIDE_SIZE) {
            int overlapping = x + IMAGE_SIDE_SIZE - screenWidth;
            TextureRegion imagePart = new TextureRegion(img, IMAGE_SIDE_SIZE - overlapping, 0, overlapping, IMAGE_SIDE_SIZE);
            batch.draw(imagePart, 0, 0, imagePart.getRegionWidth(), IMAGE_SIDE_SIZE);
        }

        batch.draw(img, x, 0);

        if (x++ > screenWidth) {
            x = 0;
        }

        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
        backgroundImg.dispose();
    }
}
