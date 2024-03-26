package com.example.day03.practice;

import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("(0을 입력하면 종료)\n정수를 입력하세요 : ");
             num = scanner.nextInt();
            sum += num;


        } while (num != 0);
        System.out.println(sum);

    }
}
