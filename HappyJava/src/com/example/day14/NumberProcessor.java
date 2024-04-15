package com.example.day14;

import java.util.Arrays;
import java.util.List;

public class NumberProcessor {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println("doubleList = " + sum(doubleList));
        System.out.println("intList = " + sum(intList));
    }
    public static <T extends Number> double sum(List<T> numbers) {
        double total = 0.0;
        for (Number number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }
}
