package com.example.day13.practice;

public class StringEx2 {
    public static void main(String[] args) {
        System.out.println(spaceCount("test tset ts ttt")); //3
        System.out.println(alphaCount("test tset ts ttt")); //13
    }

    public static int spaceCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")) {
                count += 1;
            }
        }
        return count;
    }

    public static int alphaCount(String str) {
        return str.length() - spaceCount(str);
    }
}
