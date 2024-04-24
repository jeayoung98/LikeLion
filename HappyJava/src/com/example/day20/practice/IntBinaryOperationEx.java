package com.example.day20.practice;

public class IntBinaryOperationEx {
    public static void main(String[] args) {
        IntBinaryOperation test = new IntBinaryOperation() {
            @Override
            public int apply(int a, int b) {
                return 0;
            }
        };

        IntBinaryOperation test2 = (a, b) -> 0;

        IntBinaryOperation add = (a, b) -> a + b;
        IntBinaryOperation minus = (a, b) -> a - b;
        IntBinaryOperation divide = (a, b) -> a / b;

        System.out.println(test.apply(1, 2));
        System.out.println(add.apply(1, 2));
        System.out.println(minus.apply(1, 2));
        System.out.println(test2.apply(1, 2));
        System.out.println(divide.apply(1, 2));
    }
}

