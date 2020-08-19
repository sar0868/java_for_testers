package ru.safarov.lotto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.HashSet;
import java.util.Set;

public class RowTest {


    @Test
    public void moveTest() {
        boolean testResult = true;
        Row row = new Row(31, 40);
        for (int i = 31; i < 41; i++) {
            testResult = row.moveTest(i);
            if(!testResult){
                break;
            }
        }
        Assertions.assertFalse(testResult);
    }
}