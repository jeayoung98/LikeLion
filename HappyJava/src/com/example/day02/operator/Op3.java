package com.example.day02.operator;

import com.example.day02.Book;

public class Op3 {
    public static void main(String[] args) {
        // 조건식 ? 변환값 1 : 반환값 2
        int a = 10;
        int b = 20;
        int result = a > b ? a : b;

        System.out.println(result);
        Book book = new Book();
        if (book instanceof Object) {
            System.out.println("Book 은 객체 입니다.");
        }
    }
}
