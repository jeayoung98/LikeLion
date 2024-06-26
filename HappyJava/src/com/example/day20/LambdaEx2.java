package com.example.day20;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaEx2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 2, 5, 6);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        });

        System.out.println(numbers);

        Collections.sort(numbers, (Integer a, Integer b) -> a.compareTo(b));

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

            }
        });
    }
}
