package com.example.day12;

public class ArithmeticExceptionEx {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // 0으로 나누기
        } catch (ArithmeticException e) {
            System.out.println("수학적 오류 : " + e.getMessage());
        }
    }
}
