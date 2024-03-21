package ch05;

import java.util.Scanner;

public class FactorialCalculator {
    static int computeFactorial(int n) {
        if (n > 0) return n * computeFactorial(n - 1);
        else return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("계산할 정수를 입력하세요 : ");
        int num = scanner.nextInt();
        System.out.println(computeFactorial(num));
    }
}
