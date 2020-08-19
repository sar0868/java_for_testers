package ru.safarov.lotto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class BagTest {

    @Test
    public void getMove() {
        Bag bag = new Bag();
        int move = bag.getMove();
        System.out.println(move);
        Assertions.assertEquals(89, bag.sizeBag());
    }
}