package com.example.day11.interfaceEx;

public class Cat implements Animal {
    @Override
    public void speak(){
        System.out.println("냥냥");

    }

    @Override
    public void song() {
        System.out.println("냥냥냥냥냥");
    }
}
