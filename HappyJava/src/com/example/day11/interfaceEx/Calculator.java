package com.example.day11.interfaceEx;

public interface Calculator {
    static int add(int a , int b){
        return a + b;
    }

    static int minus(int a , int b){
        return a - b;
    }

    static void light() {
        System.out.println("light");
    }
}
