package com.example.day16;
import java.io.*;

public class BufferedEx2 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
             FileWriter writer = new FileWriter("testhi.txt");) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + " hi\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
