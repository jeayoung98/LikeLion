package com.example.day20;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class RamdaEx1 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry");

        Consumer<String> ramdaTest = new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string);
            }
        };

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread start!");
//            }
//        }).start();
        new Thread(() -> System.out.println("Thread start!")).start();

        items.forEach(item -> System.out.println(item));
    }
}
