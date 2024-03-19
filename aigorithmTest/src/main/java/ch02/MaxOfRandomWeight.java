package ch02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfRandomWeight {
    public static void main(String[] args) {
//        Math.random();
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("몸무게의 최댓값을 구합니다.");
        System.out.print("사람수 : ");
        int num = scanner.nextInt();

        int[] weights = new int[num];

        for (int i = 0; i < num; i++) {
            weights[i] = 40 + rand.nextInt(60);
        }
        System.out.printf("최댓값은 %d 입니다.", maxOf(weights));
    }

    public static int maxOf(int[] weights) {
        int max = weights[0];
        for (int i = 1; i < weights.length; i++) {
            if (weights[i] > max) {
                max = weights[i];
            }
        }return max;
    }

}


