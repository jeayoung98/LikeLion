package com.example.day17.practice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTask implements Runnable {
    // 입력받은 데이터를 팡일에 쓰는 작업
    @Override
    public void run() {
        try (FileWriter writer = new FileWriter("output.txt",true)) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("x를 치면 끝");
                String input = scanner.nextLine();
                if ("x".equals(input)) {
                    break;
                }
                writer.write(input + "\n");
            }
            scanner.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
