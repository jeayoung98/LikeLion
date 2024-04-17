package com.example.day16.practice2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFileManager {
    private String filePath;

    public TextFileManager(String filePath) {
        this.filePath = filePath;
    }

    public void write(List<String> lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    public List<String> read() throws IOException{
        List<String> lines = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }return lines;
    }

}
