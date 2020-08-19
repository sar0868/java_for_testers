package ru.safarov.lotto;

public class Game {
//    Row row1 = new Row();
//    Row row2 = new Row();
    Bag bag = new Bag();
    int move;

    public void play(){
        move = bag.getMove();
//        row1.moveTest(move);
//        row2.moveTest(move);

    }
}
