package com.example.day02.enumType;

public class TodayTest {
    public static void main(String[] args) {
        Today today = new Today();
        today.setDay(Day.FRIDAY);

//        today.setDay();

        System.out.println(today.getDay());
    }
}
