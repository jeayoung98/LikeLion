package com.example.day04.matrix;

public class ForEachEx1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        //for each 문
        for (int i : arr) { // arr에서 꺼내는 값을 저장하는 i 선언
            System.out.println(i);
        }
        // for 문
        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];
            System.out.println(v);
        }
        ItemForArray[] items = new ItemForArray[4];
        items[0] = new ItemForArray(3000, "cup");
        for (ItemForArray item : items) {
            System.out.println(item.getName());
            System.out.println(item.getPrice());
        }
    }


}
