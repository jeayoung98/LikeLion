package com.example.day21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx5 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Cherry", "Date");
        List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());
        List<String> reverseSortedFruits = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedFruits);
        System.out.println(sortedFruits);
    }
}
