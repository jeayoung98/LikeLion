package com.example.day14;

import java.util.Arrays;
import java.util.List;

public class WildcardEx {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> strList = Arrays.asList("hi", "hello");
        List<Double> doubleList = Arrays.asList(1.5,2.5,3.5);
        printList(intList);
        printList(strList);
        printList(doubleList);
    }

    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
}
