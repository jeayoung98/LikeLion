package com.example.day04.practice;

public class Practice7 {
    public static void main(String[] args) {
        double[] doubles = {1.5, 3.7, 2.4, 9.8, 7.6, 3.4};
        double max=doubles[0];
        double min = doubles[0];
        for (int i = 0; i < doubles.length; i++) {
            if (max > doubles[i]) {
                max = doubles[i];
            }
            if (min < doubles[i]) {
                min = doubles[i];
            }
        }
        System.out.println("최솟값 : " + min + " 최댓값 : " + max);

    }
}
