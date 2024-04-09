package com.example.day11.interfaceEx.test;

abstract public class Order {
    abstract void orderFood(String menu, int price);
    abstract void prepareFood();
    abstract void serveFood();
    final void completeOrder(){
        prepareFood();
        serveFood();
        System.out.println("주문이 완료되었습니다!");
    }
}
