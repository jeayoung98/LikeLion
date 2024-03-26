package com.example.day03.practice;

public class Practice3 {
    public static void main(String[] args) {
        int i = 1;

        while (i++ < 10) {
            int j = 0;
            while (j++ < 10) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
