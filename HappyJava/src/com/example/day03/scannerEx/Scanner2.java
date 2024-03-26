package com.example.day03.scannerEx;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("짝수의 합을 어디까지 구할까요 ? : ");
        int num = scanner.nextInt();
        int evenSum = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println(num + "까지 짝수의 합은 : " + evenSum);


    }
}
