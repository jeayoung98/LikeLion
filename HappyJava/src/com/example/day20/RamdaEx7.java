package com.example.day20;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RamdaEx7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = number -> number % 2 == 0;
        List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenNumbers);

        Function<Integer, Integer> squareFunction = number -> number * number;
        List<Integer> squareNumbers = numbers.stream().map(squareFunction).collect(Collectors.toList());
        System.out.println(squareNumbers);
    }
}
