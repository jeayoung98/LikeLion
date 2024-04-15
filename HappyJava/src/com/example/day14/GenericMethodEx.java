package com.example.day14;

public class GenericMethodEx {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        printArrayElements(intArr);
        String[] strArr = {"hi", "hello"};
        printArrayElements(strArr);
    }
    public static <T> void printArrayElements(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
