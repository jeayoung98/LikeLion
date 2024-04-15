package com.example.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DataWriter {
    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        addNum(numList);
        addNum(objList);
        System.out.println("numList = " + numList);
        System.out.println("objList = " + objList);

    }
    public static void addNum(List<? super Integer>list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }
}
