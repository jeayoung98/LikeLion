package com.example.day13;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{name='" + name + "', age = " + age + "}";
    }
}


