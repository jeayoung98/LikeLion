package com.example.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadFile {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("b.txt");
        int n;
        int count = 0;
        byte[] bytes = new byte[1024];
        while ((n = fis.read()) != -1) {
            System.out.println((char) n);
            count++;
            fos.write(n);
        }
        System.out.println(count);
        fos.close();
    }
}
