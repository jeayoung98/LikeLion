package com.example.day04.matrix;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 배열 선언
//        int[] arr1;
        int[] arr2;
        int[] arr3;


        // 생성
//        arr1 = new int[5];
        arr2 = new int[4];
        arr3 = new int[3];

        // 이용

        int[] arr1 = {1,2,3,4,5};

        System.out.println(arr1[1]);

        // 반복문
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
            System.out.println(arr1[i]);
        }


    }
}
