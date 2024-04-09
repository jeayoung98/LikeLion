package com.example.day11.interfaceEx.test;

public class PizzaOrder extends Order {
    String menu;
    int price;
    @Override
    public void orderFood(String menu, int price){
        this.menu = menu;
        this.price = price;
    }

    @Override
    public void prepareFood(){
        System.out.printf("%d원을 결제해주세요 %s를 준비합니다\n",price,menu);
    }
    @Override
    public void serveFood(){
        System.out.printf("주문하신 %s 나왔습니다\n맛있게 드세요\n",menu);

    }
}

