package com.example.day04.matrix;

public class ArrayPractice1 {
    public static void main(String[] args) {
        double[] doubles = {1.5, 3.7, 2.4, 9.8, 7.6, 3.4};
        double maxNum= doubles[0];
        double minNum = doubles[0];
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] > maxNum) {
                maxNum = doubles[i];
            }
            if (doubles[i] < minNum) {
                minNum = doubles[i];
            }
        }System.out.println(maxNum);
        System.out.println(minNum);

    }
}
