package com.example.day11.interfaceEx.test;

public class CashPayment implements Payment {
    @Override
    public void processPayment(int price){
        System.out.println("현금 결제를 해주세요");
    }
}
