package com.example.day21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // forEach 예시
        numbers.stream().forEach(n -> System.out.println("Numbers : " + n));

        // peek 예시 (디버깅이나 요소에 대한 임시처리) stream 의 흐름을 중단하지 않음
        List<Integer> doubledNumbers = numbers.stream()
                .peek(n -> System.out.println("Processing 1 : " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("Processing 2 : " + n))
                .collect(Collectors.toList());
        System.out.println(doubledNumbers);

    }
}
