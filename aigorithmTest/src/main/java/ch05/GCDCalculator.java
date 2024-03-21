package ch05;

import java.util.Scanner;

public class GCDCalculator {
    static int GCD(int x, int y) {
        if (y == 0) {
            return x;
        } else return GCD(y, x%y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("최대공약수를 구합니다.");
        System.out.print("첫번째 정수를 입력해주세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 정수를 입력해주세요 : ");
        int num2 = scanner.nextInt();
        System.out.println(GCD(num1,num2));
    }
}
