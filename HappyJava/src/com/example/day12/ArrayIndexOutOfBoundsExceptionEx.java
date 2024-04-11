package com.example.day12;

public class ArrayIndexOutOfBoundsExceptionEx {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[3]); // 인덱스 범위 초과
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("잘못된 인덱스 접근 : " + e.getMessage());
        }
    }
}
