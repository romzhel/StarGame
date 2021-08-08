package ru.romzhel.game;

import com.badlogic.gdx.Game;

import ru.romzhel.game.screen.MenuScreen;

public class StarGame extends Game {

    @Override
    public void create() {
        setScreen(new MenuScreen());
    }
}
