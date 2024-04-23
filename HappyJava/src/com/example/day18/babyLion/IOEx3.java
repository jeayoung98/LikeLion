package com.example.day18.babyLion;

import java.io.*;

public class IOEx3 {
    public static void main(String[] args) {
        // 파일에서부터 한줄씩 읽어서 콘솔에 출력하는 코드
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ioexam.txt"));
            PrintWriter writer = new PrintWriter(new FileWriter("writer",true));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
