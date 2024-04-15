package com.example.day14;

import java.util.ArrayList;
import java.util.List;

public class WildCardVsGeneric {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<String> strList = new ArrayList<>();

//        addNum(intList);
//        addNum(strList);
        addNumGeneric(intList, 10);
        addNumGeneric(strList, "hi");
        System.out.println(intList);
        System.out.println(strList);
    }

    public static void addNum(List<?> list) {
//        list.add(1);
    }

    public static <T> void addNumGeneric(List<T> list, T element) {
        list.add(element);
    }

}
