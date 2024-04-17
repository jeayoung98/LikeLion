package com.example.day16;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamEx {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("a.txt");
             FileWriter writer = new FileWriter("c.txt");) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
