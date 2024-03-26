package com.example.day03.practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("섭씨 온도를 입력하세요 : ");
        double c = scanner.nextDouble();
        double f = c *9/5 +32;
        System.out.println("변환된 화씨 온도는 : " + f);

    }
}
