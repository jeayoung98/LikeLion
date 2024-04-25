package com.example.day20;

public class LambdaEx3 {
    public static void main(String[] args) {
        // 람다식을 이용하여 스레드 생성 및 실행
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread : " + i);
                }
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread : " + i);
            }
        }).start();
    }
}
