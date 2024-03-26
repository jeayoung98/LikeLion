package com.example;

public class StringCasting {
    public static void main(String[] args) {
        String str = "Hello" + 3; // 문자열과 다른것(문자열, 숫자, 불린형) 을 더하면 문자열이 됨
        String str1 = "Hello" + 3.14;
        String str2 = "Hello" + true;
        String str3 = 1 + "";
        System.out.println(str); // 문자열 Hello3
        System.out.println(str1); // 문자열 Hello3.14
        System.out.println(str2); // 문자열 Hellotrue
        System.out.println(str3); // 문자열 1
    }
}