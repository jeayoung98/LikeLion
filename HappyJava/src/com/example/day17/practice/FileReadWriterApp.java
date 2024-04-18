package com.example.day17.practice;

public class FileReadWriterApp {
    public static void main(String[] args) {
        Thread read = new Thread(new FileReaderTask());
        Thread write = new Thread(new FileWriterTask());

        read.start();
        write.start();
    }
}
