package ru.romzhel.game.sprite;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.romzhel.game.base.Sprite;
import ru.romzhel.game.math.Rect;

public class GameOverLabel extends Sprite {

    public GameOverLabel(TextureRegion region) {
        super(region);
    }

    @Override
    public void draw(SpriteBatch batch) {
        super.draw(batch);
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(0.05f);
        pos.set(0, 0);
    }
}
