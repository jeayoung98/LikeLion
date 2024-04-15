package com.example.day14.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 입력 처리
        inputScores(intList, scanner);

        // 점수 리스트에서 0 제거
        removeZeroScores(intList);

        // 결과 출력
        printResults(intList);
    }

    // 입력 처리 메서드
    public static void inputScores(List<Integer> intList, Scanner scanner) {
        while (true) {
            System.out.print("0 ~ 100 사이의 점수를 입력해주세요 || 0을 입력하면 종료: ");
            int score = scanner.nextInt();
            try {
                validateScore(score);
                System.out.println("입력한 숫자는 " + score + "입니다.");
                if (score == 0) {
                    break;
                }
                intList.add(score);
            } catch (IllegalArgumentException e) {
                System.out.println("예외 발생: " + e.getMessage());
            }
        }
    }

    // 점수 유효성 검사 메서드
    public static void validateScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("0-100 사이의 숫자만 입력이 가능합니다.");
        }
    }

    // 점수 리스트에서 0 제거 메서드
    public static void removeZeroScores(List<Integer> intList) {
        intList.removeIf(i -> i == 0);
    }

    // 결과 출력 메서드
    public static void printResults(List<Integer> intList) {
        if (!intList.isEmpty()) {
            System.out.println("입력된 점수: " + intList);
            int sum = sum(intList);
            double average = (double) sum / intList.size();
            System.out.println("총점: " + sum);
            System.out.println("평균: " + (int) average);
        } else {
            System.out.println("입력된 점수가 없습니다.");
        }
    }

    // 점수 합산 메서드
    public static int sum(List<Integer> intList) {
        int sum = 0;
        for (int score : intList) {
            sum += score;
        }
        return sum;
    }
}