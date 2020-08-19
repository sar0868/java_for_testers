package ru.safarov.lotto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class GameTVTest {

    @Test
    public void game() {
        Card card = new Card();
        Bag bag = new Bag();
        GameTV gameTV = new GameTV();
        Assertions.assertTrue(gameTV.game(card, bag));
    }
}