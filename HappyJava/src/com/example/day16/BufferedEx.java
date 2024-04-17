package com.example.day16;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedEx {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("bufferedExam.txt");) {

            for (int i = 0; i < 5; i++) {
                System.out.print("무엇이든 입력하세요 : ");
                writer.write(reader.readLine() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
