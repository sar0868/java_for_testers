package ru.safarov.lotto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Bag {

    private ArrayList<Integer> bag;

    public Bag() {
        createBag();
    }

    private void createBag() {
        for (int i = 1; i < 91; i++) {
            bag.add(i);
        }
    }

    public int getMove() {
        Collections.shuffle(bag);
        int move = bag.get(0);
        bag.remove(0);
        return move;
    }
    public int sizeBag(){
        return bag.size();
    }
}

