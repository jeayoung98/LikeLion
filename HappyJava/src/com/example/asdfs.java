package com.example;

import java.util.Scanner;

public class asdfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받을 정수
        System.out.print("Enter the number of strings: ");
        int num = sc.nextInt();
        sc.nextLine(); // 남아있는 개행 문자를 제거

        // num 개의 문자열 입력받기
        for (int i = 0; i < num; i++) {
            System.out.print("Enter string #" + (i+1) + ": ");
            String str = sc.nextLine(); // 문자열 입력받기
            System.out.println("Input string: " + str);
            if (isVps(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    public static boolean isVps(String str) {
        while (true) {
            String str1 = str.replace("()", ""); // "()"를 빈 문자열로 대체
            str = str1;
            if (!str.contains("()")) {
                break; // 더 이상 "()"가 없으면 반복 종료
            }
        }
        return str.isEmpty(); // 문자열이 비어있으면 VPS, 아니면 VPS 아님
    }
}