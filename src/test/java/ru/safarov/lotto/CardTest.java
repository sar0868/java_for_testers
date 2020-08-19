package ru.safarov.lotto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void moveGame() {
        Card card = new Card();
        card.printCard();
        Bag bag = new Bag();
        int move;
        for (int i = 0; i < 90; i++) {
            move = bag.getMove();
            card.moveGame(move);
            System.out.print(move + ", ");
            if(!card.isResultGame()){
                System.out.println("Win, move: " + i);
                card.printCard();
                break;
            }
        }
        Assertions.assertFalse(card.isResultGame());
    }
}