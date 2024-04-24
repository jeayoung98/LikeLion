package com.example.day20;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructTest {
    public static void main(String[] args) {
        Function<String, Car> func = name -> new Car(name);
        Car car = func.apply("벤틀리");
        System.out.println(car);

        Function<String, Car> func2 = Car::new;
        Car car2 = func2.apply("람보르기니");
        System.out.println(car2);

        BiFunction<String, Integer, Car> func3 = Car::new;
        Car car3 = func3.apply("벤츠", 90);
        System.out.println(car3);
    }
}

class Car {
    String name;
    int speed;
    public Car() {
    }

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "의 속도는 : " + speed;
    }
}

