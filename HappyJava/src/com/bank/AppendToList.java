package com.bank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppendToList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("data1.txt"));

            // 기존 데이터를 읽어 리스트에 추가
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 사용자로부터 숫자를 입력받아 리스트에 추가
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter numbers (enter 'done' to finish):");
            String input;
            while (!(input = br.readLine()).equalsIgnoreCase("done")) {
                list.add(Integer.parseInt(input));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 리스트의 내용을 파일에 저장
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data1.txt"));
            for (Integer num : list) {
                writer.write(num.toString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 리스트의 내용 출력
        System.out.println("Contents of the list:");
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}