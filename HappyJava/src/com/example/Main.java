package com.example;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] b = new int[] {1,2};

        System.out.println(Arrays.stream(b).min().orElse(0));
        Integer[] a = new Integer[]{1, 2};

        System.out.println(Arrays.asList(a).indexOf(2));
    }
}