package ru.safarov.lotto;

import java.util.ArrayList;

public class Card {

    private ArrayList <Row> card = new ArrayList<Row>();
    private boolean resultGame = true;

    public ArrayList<Row> getCard() {
        return card;
    }

    public boolean isResultGame() {
        return resultGame;
    }

    public Card() {
        Row row1 = new Row(1, 30);
        Row row2 = new Row(31, 60);
        Row row3 = new Row(61, 90);
        card.add(row1);
        card.add(row2);
        card.add(row3);
    }

    public void moveGame(int move){
        int i = 0;
        if (move > 60) {
            i = 2;
        } else if (move > 30  && move <= 60) {
            i = 1;
        }
            resultGame = card.get(i).moveTest(move);
    }

    public void printCard(){
        for (Row row: card) {
            System.out.print("row: ");
            for( Integer n: row.getRow()){
                System.out.print(n + ", ");
            }
            System.out.println();
        }
    }


}
