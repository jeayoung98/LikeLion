package com.example.day12;

public class NullPointerExceptionEx {
    public static void main(String[] args) {
        String text = null;

        try {
            int length = text.length(); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("텍스트가 null 입니다 : " + e.getMessage());

        }
    }
}
