package com.example.day11.interfaceEx;

public interface Animal {
    int AGE = 0; // 상수 취급 , 대문자로 , static final 이 생략된다
    void speak();
    default void song(){
        System.out.println("노래하다");
    }

}
