package com.example.day18.babyLion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOEx2 {
    public static void main(String[] args) {
        // 문자열을 파일에 출력
        try (FileOutputStream output = new FileOutputStream("output.txt")) {
            String strOutput = "hello, world!";
            output.write(strOutput.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
