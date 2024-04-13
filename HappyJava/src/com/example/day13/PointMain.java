package com.example.day13;

public class PointMain {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        boolean k =  point.equals(1);
        int w = point.hashCode();
        System.out.println(k);
        System.out.println(w);
    }
}
