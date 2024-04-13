package com.example.day13;

import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {
        // 현재 날짜와 시간 가져오기
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1; // 월은 0부터 시작
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("현재 날짜 : " + year + "년" + month + "월" + day + '일');

        // 특정 날짜로 설정하기
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2020, Calendar.JANUARY, 1); // 2020년 1월 1일로 설정

        // 날짜 추가 및 감소
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.YEAR, 1); // 1년추가
        calendar2.add(Calendar.MONTH, -2); // 2개월 감소
    }
}
