package ru.romzhel.game.pool;

import ru.romzhel.game.base.SpritesPool;
import ru.romzhel.game.sprite.Bullet;

public class BulletPool extends SpritesPool<Bullet> {

    @Override
    protected Bullet newSprite() {
        return new Bullet();
    }
}
