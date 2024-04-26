package com.example.day21;

import java.util.Arrays;
import java.util.List;

public class StreamEx9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 초기값 0 리듀싱 연산은 누적계산
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        int minus = numbers.stream().reduce(0, (a, b) -> a - b);


        System.out.println(sum);
        System.out.println(minus);



    }
}
