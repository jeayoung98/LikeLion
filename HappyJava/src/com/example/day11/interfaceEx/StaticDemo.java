package com.example.day11.interfaceEx;

public class StaticDemo {
    public static void main(String[] args) {
        Calculator.light();
        int value = Calculator.add(1, 2);
        Calculator.minus(1, 2);
        System.out.println(value);
    }
}