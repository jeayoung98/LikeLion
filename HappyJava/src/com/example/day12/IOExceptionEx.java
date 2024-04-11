package com.example.day12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionEx {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
            // 파일 읽기 작업
            reader.close();
        } catch (IOException e) {
            System.out.println("파일 읽기 오류 : " + e.getMessage());
        }
    }
}
