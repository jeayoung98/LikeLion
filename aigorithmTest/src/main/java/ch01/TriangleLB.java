package ch01;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 그립니다.");
        System.out.print("삼각형 단 수를 입력하세요");
        int m = scanner.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
