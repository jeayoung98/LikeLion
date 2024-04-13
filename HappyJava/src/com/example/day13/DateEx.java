package com.example.day13;

import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        // 현재 날짜와 시간 가져오기
        Date now = new Date();
        System.out.println("현재 날짜와 시간 : " + now.toString());

        // 특정 날짜와의 비교
        Date date1 = new Date(2020, 1, 1);
        Date date2 = new Date(2021,1,1);

        if (date2.after(date1)) {
            System.out.println("date2는 date1 이후의 날짜입니다.");
        }


    }
}
