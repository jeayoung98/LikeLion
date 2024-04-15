package com.example.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CollectionEx1 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        System.out.println(stringArrayList.size());
        System.out.println(stringArrayList);

        stringArrayList.add("a");
        System.out.println(stringArrayList.size());
        System.out.println(stringArrayList);

        stringArrayList.add("b");
        System.out.println(stringArrayList.size());
        System.out.println(stringArrayList);

        stringArrayList.add("c");
        System.out.println(stringArrayList.size());
        System.out.println(stringArrayList);

        stringArrayList.add("d");
        System.out.println(stringArrayList.size());
        System.out.println(stringArrayList);

        for (String str : stringArrayList) {
            System.out.println(str);
        }
        System.out.println("=========");
        System.out.println(stringArrayList.get(2));

        List<String> list = new ArrayList<>();
        list.add("ab");
        list.add("cd");
        list.add("ef");

        for (String str : list) {
            System.out.println(str);
        }

        List<String> vector = new Vector<>();
        vector.add("1");

    }
}
