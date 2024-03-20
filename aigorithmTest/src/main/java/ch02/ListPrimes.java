package ch02;

import java.util.Scanner;

public class ListPrimes {
    public static void main(String[] args) {
        int divisionCount = 0;

        for (int i = 2; i <= 1000; i++) {
            boolean isPrime=true;
            for (int j = 2; j < i - 1; j++) {
                divisionCount++;
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
        System.out.println("나눗셈 연산횟수 : " + divisionCount);
    }

}
