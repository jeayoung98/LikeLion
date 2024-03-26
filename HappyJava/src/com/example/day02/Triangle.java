package com.example.day02;

public class Triangle {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            i++;
            int t = 1;

            while (t <= i) {
                System.out.print("*");
                t++;
            }System.out.println("");
        }
    }
}
