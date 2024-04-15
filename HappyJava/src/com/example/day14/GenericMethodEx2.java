package com.example.day14;

public class GenericMethodEx2 {
    public static void main(String[] args) {
        System.out.println("최대 : " + max(3, 4.6, 4.7f));
    }
    public static <T extends Number> T max(T x, T y, T z) {
        T max = x;
        if (y.doubleValue() > max.doubleValue()) {
            max = y;
        }
        if (z.doubleValue() > max.doubleValue()) {
            max = z;
        }return max;
    }
}
