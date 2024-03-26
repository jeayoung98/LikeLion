package com.example.day03.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Random random = new Random();
        int randNUm = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 ~ 100까지 숫자를 맞춰보세요 : ");
            int answer = scanner.nextInt();
            if (answer == randNUm) {
                System.out.println("정답입니다!");
                break;
            }
            else if (answer < randNUm) {
                System.out.println("정답보다 작습니다.");
            } else if (answer > randNUm) {
                System.out.println("정답보다 큽니다.");
            }else {
                System.out.println("오답입니다.");
            }
        }
    }
}
