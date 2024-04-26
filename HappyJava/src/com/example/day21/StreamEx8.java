package com.example.day21;

import java.util.Arrays;

public class StreamEx8 {
    public static void main(String[] args) {
        int[] intArr = {12, 36, 52, 37, 29, 98};

        long length = Arrays.stream(intArr).count();
        int max = Arrays.stream(intArr)
                .boxed().max(Integer::compareTo)
                .orElse(0); // 최댓값, 비어있으면 0 반환
        int min = Arrays.stream(intArr)
                .boxed().min(Integer::compareTo)
                .orElse(0); // 최솟값, 비어있으면 0 반환
        double average = Arrays.stream(intArr)
                .average()
                .orElse(0.0); // 평균값 , 비어있으면 0 반환
        int sum = Arrays.stream(intArr).sum(); // 합계, 비어있으면 0 반환

        System.out.println("length = " + length);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);
        System.out.println("sum = " + sum);

    }
}
