package com.example.day11.interfaceEx.test;

public class CreditPayment implements Payment {
    public void processPayment(int price){
        System.out.println("카드 결제를 해주세요");
    }

}
