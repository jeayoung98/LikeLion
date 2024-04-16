package com.example.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleEx {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println("원래 순서 : " + numbers);

        Collections.shuffle(numbers);
        System.out.println("섞은 후 : " + numbers);
    }
}
