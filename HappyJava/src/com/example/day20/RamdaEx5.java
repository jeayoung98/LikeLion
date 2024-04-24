package com.example.day20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RamdaEx5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "charlie");

        // 기존 방식 : 익명 클래스를 사욯하여 Comparator 구현
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        // 출력 : [Alice,Bob,Charlie]
        System.out.println("익명 클래스로 정렬 : " + names);

        // 람다식을 사용하여 Comparator 구현
        names.sort((String s1, String s2) -> s1.compareTo(s2));

        // 출력 : [Alice,Bob,Charlie]
        System.out.println("람다식으로 정렬 : " + names);
    }
}
