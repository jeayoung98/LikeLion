package com.example.day03.label;

public class LabelEx {
    public static void main(String[] args) {
        outter:
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (i == 0 && k == 2) {
                    System.out.println(i + "," + k);
                    continue outter;
                }
            }
        }
    }
}