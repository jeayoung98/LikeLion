package com.example.day16.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<HpInfo> info = new ArrayList<>();
        Phone phone = new Phone();

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("이름 : ");
                String name = reader.readLine();
                System.out.println("전화번호 : ");
                String hp = reader.readLine();
                info.add(new HpInfo(name, hp));
            }
            Phone phone1 = new Phone();
            phone1.savePhoneBook(info);
            System.out.println("전화번호가 phone.txt 에 저장되었습니다.");
            System.out.println("phone.txt 의 내용은 다음과 같습니다 ");
            phone1.printPhoneBook();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
