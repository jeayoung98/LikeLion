package com.example.day12;

public class NumberRangeChecker {
    public void checkNumber(int number) {
        if (number < 1 || number > 100) {
            throw new IllegalArgumentException("숫자는 1과 100 사이에 있어야 합니다 : " + number);
        }
        System.out.println("입력한 숫자는 규칙에 맞습니다 : "+number);
    }

    public static void main(String[] args) {
        NumberRangeChecker checker = new NumberRangeChecker();
        try {
            checker.checkNumber(150); // 범위를 벗어난 숫자
        } catch (IllegalArgumentException e) {
            System.out.println("오류 발생 : " + e.getMessage());
        }
    }
}
