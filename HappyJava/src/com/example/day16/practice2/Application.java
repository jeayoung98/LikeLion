package com.example.day16.practice2;

import java.io.IOException;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        String filePath = "texts.txt";
        TextFileManager fileManager = new TextFileManager(filePath);
        UserInputHandler inputHandler = new UserInputHandler();

        try {
            List<String> fileContent = fileManager.read();
            List<String> userInput = inputHandler.input();
            fileManager.write(userInput);
            
            System.out.println("Content of the file:");
            fileContent.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
