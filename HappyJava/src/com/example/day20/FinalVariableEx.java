package com.example.day20;

public class FinalVariableEx {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("람다에서 파이널로 사용 .");

        Runnable runnable = () -> {
            System.out.println("x : " + x);
        };
        // 사실상 final 변수여서 재할당되지 않음
//         x= 20;
        runnable.run();
    }
}
