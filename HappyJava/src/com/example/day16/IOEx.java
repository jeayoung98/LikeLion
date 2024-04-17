package com.example.day16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class IOEx {
    public static void main(String[] args) throws Exception {
        // 키보드로 부터 한줄씩 입력 받아서 콘솔에 출력

        // 키보드 System.in
        // BufferedReader (한줄씩)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new FileReader("a.txt"));
        String str = br.readLine();
        System.out.println(str);
        System.out.println(br2.readLine());
    }
}
