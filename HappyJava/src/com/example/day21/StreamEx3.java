package com.example.day21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("자말무시알라", "토마스뮐러", "김민재", "파블로비치", "더리흐트", "해리케인","키미히","고레츠카","코망","더리흐트","토마스뮐러");
        names.stream().filter(n -> n.length() >= 5).forEach(System.out::println);
        System.out.println(names.stream().filter(n -> n.length() >= 5).distinct().collect(Collectors.toList()));


        //짝수만 3곱하기
        int[] intArr = {3,6,3,76,4,2};
        Arrays.stream(intArr).map(num -> num*3).forEach(System.out::println);
        System.out.println("==========") ;
        Arrays.stream(intArr).filter(num->num%2==0).map(num->num*3).sequential().forEach(System.out::println);
    }
}
