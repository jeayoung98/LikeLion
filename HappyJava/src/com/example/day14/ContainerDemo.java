package com.example.day14;

public class ContainerDemo {
    public static void main(String[] args) {
        Container<String> stringContainer = new StringContainer();
        stringContainer.set("hi");
        System.out.println(stringContainer.get());
        Container<Integer> integerContainer = new IntegerContainer();
        integerContainer.set(10);
        System.out.println(integerContainer.get());

    }
}
