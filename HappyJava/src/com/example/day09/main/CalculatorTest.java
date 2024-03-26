package com.example.day09.main;

import com.example.day09.util.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int plus = calculator.plus(4, 6);
        int minus = calculator.minus(3, 5);
        System.out.println("plus = " + plus);
        System.out.println("minus = " + minus);
    }
}
