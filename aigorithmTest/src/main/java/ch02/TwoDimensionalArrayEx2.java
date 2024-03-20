package ch02;

import java.util.Scanner;

public class TwoDimensionalArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요 : ");
        int students = scanner.nextInt();
        System.out.print("과목 수를 입력하세요 : ");
        int subjects = scanner.nextInt();

        int[][] scores = new int[students][subjects];

        for (int i = 0; i < students; i++) {
            System.out.println(i + 1 + "번 학생의 점수를 입력하세요");
            for (int j = 0; j < subjects; j++) {
                System.out.print(j + 1 + "번 과목 점수 : ");
                scores[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        for (int[] grade : scores) {
            for (int j : grade)

                System.out.print(j + " ");
            System.out.println();
        }
    }
}
