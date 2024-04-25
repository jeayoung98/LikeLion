package com.example.day21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "b", "c", "ad");
        List<String> filteredList = myList.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
        System.out.println(filteredList);

        List<String> names = Arrays.asList("jung", "hong", "kim", "lee");
        Arrays.stream(new List[]{names}).forEach(System.out::println);
    }
}
