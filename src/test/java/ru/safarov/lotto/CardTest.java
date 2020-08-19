package ru.safarov.lotto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CardTest {


    @Test
    public void moveTest() {
        Card card = new Card();
        int [] data1 = {2 , 13 , 17, 3, 29 , 34, 45, 51, 30, 58, 62, 73 ,74 , 72 , 82};
        Set<Integer> testCard = new HashSet<Integer>();
        for (int i=0; i< data1.length; i++) {
            testCard.add(data1[i]);
        }
        card.setCard(testCard);
        int [] move = {2 , 13 , 17, 3, 29 , 34, 45, 51, 30, 58, 62, 73 ,74 , 72 , 82};
        for (int i = 0; i < move.length; i++) {
            card.moveTest(move[i]);
        }
        Assertions.assertTrue(card.getCard().isEmpty());
        }

    @Test
    public void moveTest2() {
        Card card = new Card();
        int [] move = {2 , 13 , 17, 3, 29 , 34, 45, 51, 30, 58, 62, 73 ,74 , 72 , 82};
        for (int i = 0; i < move.length; i++) {
            card.moveTest(move[i]);
        }
        Assertions.assertTrue(card.getCard().isEmpty());
    }
}