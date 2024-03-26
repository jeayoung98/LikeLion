package com.example.day03.ifEx;

public class IfEx4 {
    public static void main(String[] args) {
        String str = "a";
        if (str == "a" || str == "A") {
            System.out.println("A입니다.");
        } else if (str == "b" || str == "B") {
            System.out.println("B입니다.");
        } else if (str == "c" || str == "C") {
            System.out.println("C입니다.");
        } else {
            System.out.println("A,B,C가 아닙니다.");
        }
    }
}
