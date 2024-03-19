package ch01;

import java.util.Scanner;

public class Oddsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1부터 n까지 홀수들의 합");
        System.out.print("정수를 입력해주세요 : ");
        int num = scanner.nextInt();
        int oddSum = 0;

        for (int i = 1; i < num; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            }

        }
        System.out.println(num + "까지의 홀수의 합은 : " + oddSum);

    }
}
