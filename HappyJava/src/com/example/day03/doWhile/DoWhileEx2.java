package com.example.day03.doWhile;

public class DoWhileEx2 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        do {
            num += 2;
            sum += num;
        } while (num < 100);
        System.out.println(sum);
    }
}
