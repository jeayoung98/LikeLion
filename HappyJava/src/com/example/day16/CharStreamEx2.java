package com.example.day16;

import java.io.*;

public class CharStreamEx2 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("a.txt");
             ) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
