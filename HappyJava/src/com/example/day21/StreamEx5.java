package com.example.day21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx5 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Cherry", "Date");
        List<String> sortedFruits = fruits.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> reverseSortedFruits = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(reverseSortedFruits);
        System.out.println(sortedFruits);

        int[] iarr = {5, 3, 7, 123, 5, 7, 9, 1, 235, 345};

        // 오름차순
        System.out.println(Arrays.toString(Arrays.stream(iarr).sorted().toArray()));

        // 내림차순
        System.out.println(Arrays
                .toString(Arrays.stream(iarr)
                        .boxed().sorted(Comparator.reverseOrder())
                        .mapToInt(i -> i).toArray()));

        int i = 10;
        Integer ii = i; // 오토 박싱

        int j = ii; // 오토 언박싱
    }
}
