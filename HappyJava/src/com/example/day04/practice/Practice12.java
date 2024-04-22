package com.example.day04.practice;

import java.util.Arrays;

public class Practice12 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[array1.length + j] = array2[j];
        }
        Arrays.sort(array3);
        for (int k = 0; k < array3.length-1; k++) {
            if (array3[k] == array3[k + 1]) {
                array3[k] =0;
            }
        }int count =0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    count++;
                }
            }
        }Arrays.sort(array3);
        System.out.println(Arrays.toString(Arrays.copyOfRange(array3,count,array3.length-1)));

    }
}
