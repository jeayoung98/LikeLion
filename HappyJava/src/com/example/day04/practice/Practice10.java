package com.example.day04.practice;

import java.util.Arrays;

public class Practice10 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};
        int count = 0;
        int[] newArray3 = {};
        int[] array3 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    array3[count++] = array1[i];
                }
                newArray3 = Arrays.copyOf(array3, count);
            }
        }
        System.out.println(Arrays.toString(newArray3));
    }
}

