package com.example.day03.whileEx;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (num <= 100) {
            if (num++ % 2 == 0) {
                sum += num;
            }
        }System.out.println(sum);
        }
    }

