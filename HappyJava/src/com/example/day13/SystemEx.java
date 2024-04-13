package com.example.day13;

import java.util.Arrays;

public class SystemEx {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // 걸리는 시간 조회
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        System.out.println("수행시간 : " + (endTime - startTime) + "ms");

        // 환경 변수 조회
        String pathVariable = System.getenv("PATH");
        System.out.println("Path variable : " + pathVariable);

        // 배열 복사
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destArray = new int[10];
        System.arraycopy(sourceArray, 1, destArray, 3, 3);
        System.out.println(Arrays.toString(destArray));


    }
}
