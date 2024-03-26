package com.example.day04.practice;

public class Practice8 {
    public static void main(String[] args) {
        int[] scores = {70, 85, 90, 45, 100};
        int sum = 0;
        double average = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        average = sum / scores.length;
        System.out.println("모든 숫자의 합은 : " + sum);
        System.out.println("평균은 : " + average);
    }
}
