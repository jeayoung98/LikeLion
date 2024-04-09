package com.example.day11.interfaceEx;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate(100);
        car.accelerate(20);
        car.accelerate(10);
        car.decelerate(20);
        car.decelerate(10);
    }
}
