package ru.romzhel.game.screen;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import ru.romzhel.game.base.BaseScreen;
import ru.romzhel.game.math.Rect;
import ru.romzhel.game.sprite.Background;
import ru.romzhel.game.sprite.Logo;

public class MenuScreen extends BaseScreen {

    private Texture bg;
    private Background background;
    private Texture img;
    private Logo logo;

    @Override
    public void show() {
        super.show();
        bg = new Texture("textures/bg.png");
        background = new Background(bg);
        img = new Texture("images/badlogic.jpg");
        logo = new Logo(img);
    }

    @Override
    public void resize(Rect worldBounds) {
        background.resize(worldBounds);
        logo.resize(worldBounds);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        draw();
        update(delta);
    }

    private void update(float delta) {
        logo.update(delta);
    }

    public void draw() {
        batch.begin();
        background.draw(batch);
        logo.draw(batch);
        batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();
        bg.dispose();
        img.dispose();
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        logo.touchDown(touch, pointer, button);
        return false;
    }
}
