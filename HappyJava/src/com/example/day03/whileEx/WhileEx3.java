package com.example.day03.whileEx;

public class WhileEx3 {
    public static void main(String[] args) {
        int num = 0;
        while (num < 10) {
            num++;
            if (num % 2 != 0) {
                continue;

            }System.out.println(num);

        }
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            } else {
                System.out.println(i);
            }

        }
    }
}
