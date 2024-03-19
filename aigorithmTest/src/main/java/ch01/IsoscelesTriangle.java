package ch01;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height;
        while (true) {
            System.out.print("삼각형의 높이를 입력하세요 : ");
            height = scanner.nextInt();

            if (height <= 0) {
                System.out.println("양의 정수를 입력하세요.");
                continue;
            }break;
        }


        draw(height);
    }

    public static void draw(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
