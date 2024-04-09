package com.example.day11.interfaceEx;

public class Dog implements Animal {
    @Override
    public void speak(){
        System.out.println("멍멍");
    }

    @Override
    public void song() {
        System.out.println("멍멍멍멍냥멍");
    }
}
