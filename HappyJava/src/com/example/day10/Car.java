package com.example.day10;

public class Car {
    String name;
    int speed;

        public Car() {
        System.out.println("car() 생성자 호출");
    }
    public Car(String name) {
        this(name,90);
        System.out.println("car(String name) 생성자 호출");
    }
    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public Car(int speed) {
        this("", speed);
    }
}
