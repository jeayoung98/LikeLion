package com.example.day04.practice;

import java.util.Arrays;

public class Practice9 {
    public static void main(String[] args) {
        String[] words = {"Java", "Python", "C", "JavaScript"};
        String last = words[words.length - 1];
        for (int i = words.length - 1; i > 0; i--) {
            words[i] = words[i - 1];
        }
        words[0] =last;
        System.out.println(Arrays.toString(words));
        }

}



