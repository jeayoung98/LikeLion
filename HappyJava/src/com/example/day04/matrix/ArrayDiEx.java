package com.example.day04.matrix;

public class ArrayDiEx {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][2];
        arr1[0][1]= 10;

        int[][] arr2 = new int[3][];
        arr2[0] = new int[3]; // NullPointerException
        arr2[1] = new int[2];
        arr2[2] = new int[10];

        arr2[0][0] = 10;
    }
}
