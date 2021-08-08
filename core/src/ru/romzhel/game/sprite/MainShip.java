package ru.romzhel.game.sprite;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector2;

import ru.romzhel.game.base.Sprite;
import ru.romzhel.game.math.AtlasUtils;
import ru.romzhel.game.math.Rect;

public class MainShip extends Sprite {

    private static final float PADDING = 0.03f;
    private static final float MOVE_STEP = 0.005f;
    private Rect worldBounds;
    private Vector2 v;

    public MainShip(TextureAtlas atlas) {
        super(AtlasUtils.getTextureRegion(atlas.findRegion("main_ship"), 2, 0, 0));
        v = new Vector2();
    }

    @Override
    public void resize(Rect worldBounds) {
        this.worldBounds = worldBounds;
        setHeightProportion(0.1f);
        setBottom(worldBounds.getBottom() + PADDING);
        setRight(getHalfWidth());
    }

    @Override
    public void update(float delta) {
        pos.add(v);

        if (getLeft() < -worldBounds.getHalfWidth()) {
            setLeft(-worldBounds.getHalfWidth());
        } else if (getRight() > worldBounds.getHalfWidth()) {
            setRight(worldBounds.getHalfWidth());
        }
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        if (touch.x < 0) {
            moveLeft();
        } else if (touch.x > 0) {
            moveRight();
        }
        return false;
    }

    @Override
    public boolean touchUp(Vector2 touch, int pointer, int button) {
        stopMove();
        return false;
    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.LEFT) {
            moveLeft();
        } else if (keycode == Input.Keys.RIGHT) {
            moveRight();
        }
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        stopMove();
        return false;
    }

    private void moveRight() {
        v.set(MOVE_STEP, 0);
    }

    private void moveLeft() {
        v.set(-MOVE_STEP, 0);
    }

    private void stopMove() {
        this.v.set(0, 0);
    }
}
