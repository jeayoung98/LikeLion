package com.example.day15;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("a");
        System.out.println(set);

        Set<Pen> penSet = new HashSet<>();
        penSet.add(new Pen("red"));
        penSet.add(new Pen("blue"));
        penSet.add(new Pen("purple"));
        penSet.add(new Pen("black"));
        System.out.println(penSet);
        penSet.add(new Pen("red"));
        System.out.println(penSet);
    }
}
