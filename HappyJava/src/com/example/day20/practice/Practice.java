package com.example.day20.practice;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        // 1.문자열 리스트 정렬하기
        List<String> words = Arrays.asList("Hello", "world", "java", "hi jung");
        Collections.sort(words, (a, b) -> a.length() - b.length());
        System.out.println(words);

        // 2. 최대값 찾기
        List<Integer> intList = Arrays.asList(1, 2, 34, 4, 5, 6, 7);
        Collections.sort(intList, (Integer a, Integer b) -> a.compareTo(b));
        System.out.println(intList.get(intList.size() - 1));

        // 3. 리스트의 각 요소에 연산 적용하기
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> plusNum = new ArrayList<>();
        numbers.forEach(n -> plusNum.add(n + 10));
        System.out.println(plusNum);

        List<Integer> plusNum1 = numbers.stream().map(n -> n + 10).collect(Collectors.toList());
        System.out.println(plusNum1);

        // 4. 조건에 맞는 요소 찾기
        List<String> words1 = Arrays.asList("Hello", "world", "java", "hi jung");
        Predicate<String> length = s -> s.length() >= 5;
        String word2 = "";
        for (String word : words1) {
            if (length.test(word)) {
                word2 = word;
                break;
            }
        }
        System.out.println(word2);

        // 5. 요소 변환하기
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Function<Integer, Integer> square = n -> n * n;
        List<Integer> squaredNumArr1 = new ArrayList<>();
        numbers1.forEach(n -> squaredNumArr1.add(square.apply(n)));
        System.out.println(squaredNumArr1);
        List<Integer> squaredNumArr = numbers1.stream().map(square).collect(Collectors.toList());
        System.out.println(squaredNumArr);

        // 6. 모든 요소에 대해 조건 확인하기
        Predicate<Integer> isEven = s -> s % 2 == 0;
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        for (int num : numbers2) {
            System.out.println(isEven.test(num));
        }

    }

}
