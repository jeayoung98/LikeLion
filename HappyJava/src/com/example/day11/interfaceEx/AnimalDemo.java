package com.example.day11.interfaceEx;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();;
        Animal cat = new Cat();

        dog.speak();
        cat.speak();
        System.out.println(Animal.AGE);
        dog.song();
        cat.song();
    }
}
