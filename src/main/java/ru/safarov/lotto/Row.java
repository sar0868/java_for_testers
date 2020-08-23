package ru.safarov.lotto;

import java.util.HashSet;
import java.util.Set;


public class Row {

    private Set<Integer> row = new HashSet<Integer>();

    public void setRow(Set<Integer> row) {
        this.row = row;
    }

    public Set<Integer> getRow() {
        return row;
    }

    public Row(int min, int max) {
        for (int i = 0; i < 5 ; i++) {
            while (true){
                int temp = min + (int)(Math.random()*(max-min));
                if (!row.contains(temp)){
                    row.add(temp);
                    break;
                }
            }
        }
    }


    public boolean moveTest (int move ) {
        if (row.contains(move)) {
            row.remove(move);
            if (row.isEmpty()) {
                return false;
            }
        }
        return true;
    }


}
