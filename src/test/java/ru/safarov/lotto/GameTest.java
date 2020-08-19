package ru.safarov.lotto;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void play() {
        Game game = new Game();
        for(int i = 0; i < 90; i++){
            game.play();
        }
    }
}