package com.example.day12;

public class ExceptionEx {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            System.out.println(10 / i);
            int result = 10 / i;
        } catch (ArithmeticException e) {
            System.out.println("오류 ! : " + e.getMessage());
        }finally {
            System.out.println("프로그램 종료!");
        }
    }
}
