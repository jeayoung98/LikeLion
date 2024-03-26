package com.example.day04.matrix;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] copyFrom = {1, 2, 3, 4, 5, 6, 7, 9};

        int[] copyTo = Arrays.copyOf(copyFrom, copyFrom.length);

        for (int i : copyTo) {
            System.out.println(i);
        }
        System.out.println("========================");

        int[] copyTo1 = Arrays.copyOf(copyFrom, 3);
    }
}
