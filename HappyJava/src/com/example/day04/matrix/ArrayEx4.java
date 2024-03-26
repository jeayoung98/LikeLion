package com.example.day04.matrix;

import java.util.Arrays;

public class ArrayEx4 {
    public static void main(String[] args) {
        char[] copyFrom = {'h', 'e', 'l', 'l', 'o'};

        char[] copyTo = Arrays.copyOfRange(copyFrom, 1, 5);

        for (char c : copyTo) {
            System.out.println(c);
        }
    }
}
