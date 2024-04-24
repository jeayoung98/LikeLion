package com.example.day20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RamdaEx4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 3, 1, 4);

        // 람다식을 사용하여 정렬기준 정의
        Collections.sort(numbers,(Integer a, Integer b)->{
            return a.compareTo(b);
        });

        // 정렬된 리스트 출력
        numbers.forEach(n -> System.out.println(n));
    }
}
