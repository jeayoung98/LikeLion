package ch01;

import java.util.Scanner;

public class Median {
    public static int med(int a, int b, int c) {
        double avg = (a + b + c) / 3;

        double num1 = avg - a;
        if (num1 < 0) {
            num1 = -num1;
        }
        double num2 = avg - b;
        if (num2 < 0) {
            num2 = -num2;
        }
        double num3 = avg - c;
        if (num3 < 0) {
            num3 = -num3;
        }

        double val = num1;
        int med = a;

        if (val > num2) {
           med = b;
           val = num2;
        }
        if (val > num3) {
            med = c;
        }
        return med;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("세정수의 중앙값을 구합니다. ");
        System.out.print("첫번째 정수를 입력하세요 : ");
        int a = scanner.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int b = scanner.nextInt();
        System.out.print("세번째 정수를 입력하세요 : ");
        int c = scanner.nextInt();

        System.out.println("중간값은 : " + med(a, b, c));
    }
}
