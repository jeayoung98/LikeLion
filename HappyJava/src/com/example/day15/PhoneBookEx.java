package com.example.day15;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookEx {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        // 전화번호 추가
        phoneBook.put("김철수", "010-1234-5678");
        phoneBook.put("박영희", "010-6234-2532");
        phoneBook.put("이민지", "010-9823-8115");

        // 특정 키를 이용해 전화번호 검색
        String minjiNum = phoneBook.get("이민지");
        System.out.println("이민지 전화번호 : " + minjiNum);

        // 전체 전화번호 목록 출력
        System.out.println("전체 전화번호 목록");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
