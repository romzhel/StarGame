package ru.romzhel.game.sprite;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.romzhel.game.base.BaseButton;
import ru.romzhel.game.math.Rect;
import ru.romzhel.game.screen.GameScreen;

public class NewGameButton extends BaseButton {

    private GameScreen gameScreen;

    public NewGameButton(TextureRegion region, GameScreen gameScreen) {
        super(region);
        this.gameScreen = gameScreen;
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(0.05f);
        pos.set(0, -0.25f);
    }

    @Override
    public void action() {
        gameScreen.restart();
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        return super.touchDown(touch, pointer, button);
    }

    @Override
    public boolean touchUp(Vector2 touch, int pointer, int button) {
        return super.touchUp(touch, pointer, button);
    }
}
