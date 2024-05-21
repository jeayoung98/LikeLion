package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받을 정수
        int num = Integer.parseInt(br.readLine().trim());

        // num 개의 문자열 입력받기
        for (int i = 0; i < num; i++) {
            String str = br.readLine(); // 문자열 입력받기
            if (isVps(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isVps(String str) {
        while (true) {
            str = str.replace("()", ""); // "()"를 빈 문자열로 대체
            if (!str.contains("()")) {
                break; // 더 이상 "()"가 없으면 반복 종료
            }
        }
        return str.isEmpty(); // 문자열이 비어있으면 VPS, 아니면 VPS 아님
    }
}
