package ru.safarov.lotto;

import java.util.HashSet;
import java.util.Set;


public class Card {

    private Set<Integer> card = new HashSet<Integer>();

    public void setCard(Set<Integer> card) {
        this.card = card;
    }

    public Set<Integer> getCard() {
        return card;
    }

//    private ArrayList<Integer> row2;
//    private ArrayList<Integer> row3;

    public Card() {
        int min = 1;
        int max = 91;
        for (int i = 0; i < 15 ; i++) {
            while (true){
                int temp = min + (int)(Math.random()*(max-min));
                if (!card.contains(temp)){
                    card.add(temp);
                    break;
                }
            }
        }
    }


    public void moveTest (int move ) {
        if (card.contains(move)) {
            card.remove(move);
            if (card.isEmpty()) {
                System.out.println("Win");
            }
        }
    }


}
