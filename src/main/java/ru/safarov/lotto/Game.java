package ru.safarov.lotto;

public class Game {
    Card card1 = new Card();
    Card card2 = new Card();
    Bag bag = new Bag();
    int move;

    public void play(){
        move = bag.getMove();
        card1.moveTest(move);
        card2.moveTest(move);

    }
}
