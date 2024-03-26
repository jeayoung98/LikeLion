package com.example.day04.matrix;

public class ArrayEx2 {
    public static void main(String[] args) {
        ItemForArray[] array1 = new ItemForArray[5];
        ItemForArray array2[];
        array2 = new ItemForArray[5];

        array1[0] = new ItemForArray(1000, "pen");
        ItemForArray[] array3 = new ItemForArray[]{new ItemForArray(500, "paper"), new ItemForArray(400, "apple"), new ItemForArray(800, "banana")};
        ItemForArray[] array4 = {new ItemForArray(500, "paper"), new ItemForArray(400, "apple"), new ItemForArray(800, "banana")};
        System.out.println(array3[0].getName());
        System.out.println(array3[0].getPrice());
        System.out.println(array3[1].getName());
    }
}
