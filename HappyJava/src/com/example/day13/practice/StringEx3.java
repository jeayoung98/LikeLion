package com.example.day13.practice;

public class StringEx3 {
    public static void main(String[] args) {
        System.out.println(reverseChange("abc")); //cba
        
    }

    public static String reverseChange(String str) {
        StringBuilder result = new StringBuilder(str);
        return result.reverse().toString();
        }
    }

