package ru.safarov.lotto;

import java.util.ArrayList;
import java.util.Collections;

public class Bag {

    private ArrayList<Integer> bag = new ArrayList<Integer>();

    public Bag() {
        for (int i = 1; i < 91; i++) {
            bag.add(i);
        }
    }

    public int getMove() {
        Collections.shuffle(bag);
        int move = bag.remove(0);
        return move;
    }
    public int sizeBag(){
        return bag.size();
    }
}

