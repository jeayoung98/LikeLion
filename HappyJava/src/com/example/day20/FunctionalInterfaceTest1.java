package com.example.day20;

public class FunctionalInterfaceTest1 {
    public static void main(String[] args) {
        FunctionalInterface1 functionalInterface1 = (x, y) -> {
            return x + y;
        };
        System.out.println(functionalInterface1.method(123,5532));
    }
}
