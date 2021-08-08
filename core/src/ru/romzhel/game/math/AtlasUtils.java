package ru.romzhel.game.math;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AtlasUtils {

    public static TextureRegion getTextureRegion(TextureAtlas.AtlasRegion atlasRegion, int cols, int row, int col) {
        int width = atlasRegion.getRegionWidth() / cols;
        int height = atlasRegion.getRegionHeight();
        return atlasRegion.split(width, height)[row][col];
    }
}
