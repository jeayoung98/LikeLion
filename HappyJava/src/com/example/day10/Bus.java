package com.example.day10;

public class Bus extends Car {
    public Bus() {
//        super(); // 생략하면, 자동으로 호출됨.
        System.out.println("Bus() 생성자 실행");
    }
    public Bus(String name) {
        super(name);
//        this.name = name;
        System.out.println("Bus(String name) 생성자 실행");
    }

}
