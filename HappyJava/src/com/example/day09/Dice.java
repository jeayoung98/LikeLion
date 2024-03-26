package com.example.day09;

import java.util.Random;


public class Dice {

    int face =6;
    int eye;

    public void dice(){
        eye = new Random().nextInt(face)+1;
    }

    public int eye(){
        return eye;
    }
    public int roll() {
        eye = new Random().nextInt(face) + 1;
        return eye;
    }
    public static int diceGame(Dice dice, int totalCount, int eye) {
        int count = 0;
        for (int i = 0; i < totalCount; i++) {
            dice.roll();
            if (dice.eye == eye) {
                count ++;
            }
        }
        return count;
    }

}
