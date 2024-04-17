package com.example.day16.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserInputHandler {
    public List<String> input() throws IOException {
        List<String> input = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("텍스트를 입력하세요 (end -> 끝)");
        String line;
        while (!(line = reader.readLine()).equals("end")) {
            input.add(line);
        }
        return input;
    }
}
