package com.example.day03.practice;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = scanner.nextInt();
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        System.out.println(fac);
    }
}
