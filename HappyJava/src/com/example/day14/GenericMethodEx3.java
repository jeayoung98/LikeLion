package com.example.day14;

import java.util.List;

public class GenericMethodEx3 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3);
        printFirst(integerList);

        List<String> strList = List.of("hi", "hello");
        printFirst(strList);
    }

    public static <T> void printFirst(List<? extends T> list) {
        if (!list.isEmpty()) {
            T item = list.get(0);
            System.out.println(item);
        }
    }
}
