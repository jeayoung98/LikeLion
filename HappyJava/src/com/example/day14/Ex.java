package com.example.day14;

import com.example.day02.Book;

import java.util.ArrayList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("test");
        list.add(10);
        list.add(new Book());

        System.out.println(list);

        List<String> stringList = new ArrayList<>();
        stringList.add("abc");
//        stringList.add(10);
//        stringList.add(new Book());
    }
}
