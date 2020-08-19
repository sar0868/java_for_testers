package ru.safarov.lotto;

import java.util.ArrayList;

public class Card {

    private ArrayList<Integer> card;

    public void setCard(ArrayList<Integer> card) {
        this.card = card;
    }

    public ArrayList<Integer> getCard() {
        return card;
    }

//    private ArrayList<Integer> row2;
//    private ArrayList<Integer> row3;

//    public Card() {
//        int min = 1;
//        int max = 30;
//        for (int i = 0; i < 5 ; i++) {
//             for (int j = 0; i < 5; i++) {
//                Random rnd = new Random();
//                Boolean resultAdd = true;
//                while (resultAdd){
//                    int temp = min + rnd.nextInt(max - min);
//                    if (card.indexOf(temp) != -1 ){
//                        card.add(temp);
//                        resultAdd = false;
//                    }
//                }
//            }
//            min += 30;
//            max += 30;
//        }
//    }


    public void moveTest (int move ) {
        int ind = card.indexOf(move);
        if (ind != -1) {
            card.remove(ind);
            if (card.isEmpty()) {
                System.out.println("Win");
            }
        }
    }


}
