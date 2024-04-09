package com.example.day11.interfaceEx.test;

import java.util.HashMap;
import java.util.Scanner;

public class OrderSystemDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("불고기 버거", 3000);
        map.put("새우 버거", 2500);
        map.put("핫치킨 피자", 9000);
        map.put("페퍼로니 피자", 7000);


        Scanner scanner = new Scanner(System.in);
        System.out.print("주문 하실 음식종류를 선택해주세요(햄버거/피자) : ");
        String food = scanner.nextLine();
        int price = 0;
        while (true) {
            if (food.equals("햄버거")) {
                Order burger = new BurgerOrder();
                System.out.print("메뉴 : 불고기 버거, 새우 버거\n주문 하실 메뉴를 선택해주세요 : ");
                String menu = scanner.nextLine();
                price = map.get(menu);
                burger.orderFood(menu, price);
                while (true) {
                    System.out.print("결제 방식을 선택해주세요(현금 / 카드) : ");
                    String paymentWay = scanner.nextLine();
                    if (paymentWay.equals("현금")) {
                        CashPayment cashPayment = new CashPayment();
                        cashPayment.processPayment(price);
                        burger.prepareFood();
                        burger.serveFood();
                        burger.completeOrder();
                        break;
                    } else if (paymentWay.equals("카드")) {
                        CreditPayment creditPayment = new CreditPayment();
                        creditPayment.processPayment(price);
                        burger.prepareFood();
                        burger.serveFood();
                        burger.completeOrder();
                        break;
                    } else {
                        System.out.println("다시 선택해주세요");
                    }break;
                }
            }else if (food.equals("피자")) {
                Order pizza = new PizzaOrder();
                System.out.print("메뉴 : 페퍼로니 피자, 핫치킨 피자\n주문 하실 메뉴를 선택해주세요 : ");
                String menu1 = scanner.nextLine();
                price = map.get(menu1);
                pizza.orderFood(menu1, price);
                while (true) {
                    System.out.print("결제 방식을 선택해주세요(현금 / 카드) : ");
                    String paymentWay = scanner.nextLine();
                    if (paymentWay.equals("현금")) {
                        CashPayment cashPayment = new CashPayment();
                        cashPayment.processPayment(price);
                        pizza.prepareFood();
                        pizza.serveFood();
                        pizza.completeOrder();
                        break;
                    } else if (paymentWay.equals("카드")) {
                        CreditPayment creditPayment = new CreditPayment();
                        creditPayment.processPayment(price);
                        pizza.prepareFood();
                        pizza.serveFood();
                        pizza.completeOrder();
                        break;
                    } else {
                        System.out.println("다시 선택해주세요");
                    }break;
                }
            }else System.out.println("다시 선택해주세요");
            break;
        }
    }
}



