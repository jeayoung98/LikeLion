package com.example.day03.scannerEx;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단 단수를 입력하세요 : ");
        int n = scanner.nextInt();
        System.out.println(n + "단");

        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + i * n);
        }
    }
}
