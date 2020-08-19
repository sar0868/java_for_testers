package ru.safarov.lotto;

public class GameTV {

    public boolean game(Card card, Bag bag){
        int move;
        for (int i = 0; i < 30; i++) {
            move = bag.getMove();
            card.moveGame(move);
            if(!card.isResultGame()){
                return true;
            }
        }
        return false;
    }
}
