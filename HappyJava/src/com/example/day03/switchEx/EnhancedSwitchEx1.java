package com.example.day03.switchEx;

public class EnhancedSwitchEx1 {
    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");

            default -> System.out.println("???");
        }
    }
}
