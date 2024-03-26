package com.example.day07;

public class MaxValue {
    public static int max(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        int a = 30;
        int b = 78;
        int c = 56;

        int result =max(a, b, c);
        System.out.println("최댓값 : " + result);
    }


}
