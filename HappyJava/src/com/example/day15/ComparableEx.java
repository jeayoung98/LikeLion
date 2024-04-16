package com.example.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kang");
        list.add("kim");
        list.add("hong");
        list.add("jung");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
