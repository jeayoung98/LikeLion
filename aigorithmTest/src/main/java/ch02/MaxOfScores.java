package ch02;

import java.util.Scanner;

public class MaxOfScores {
    public static int maxOf(int[] scores) {
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("배열의 최댓값을 구합니다.");
        System.out.print("배열 길이를 입력해주세요 : ");
        int ArrayLength = scanner.nextInt();
        int[] grade = new int[ArrayLength];
        
        for (int i = 0; i < ArrayLength; i++) {
            System.out.print("값을 입력해주세요 : ");
            grade[i] = scanner.nextInt();
        }
        System.out.printf("최댓값은 %d 입니다.",maxOf(grade));
    }
        
}

