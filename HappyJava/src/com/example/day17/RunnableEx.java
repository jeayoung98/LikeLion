package com.example.day17;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable 출발");
        // 쓰레드가 해야하는 일
        for (int i = 0; i < 100; i++) {
            System.out.println("MyRunnable 안녕!");
        }
        System.out.println("MyRunnable 종료!");
    }
}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable1 출발");
        // 쓰레드가 해야하는 일
        for (int i = 0; i < 100; i++) {
            System.out.println("MyRunnable1 안녕!");
        }
        System.out.println("MyRunnable1 종료!");
    }
}

public class RunnableEx {
    public static void main(String[] args) {
        System.out.println("main 출발");

        // 쓰레드 생성
        Thread thread = new Thread(new MyRunnable());
        Thread thread1 = new Thread(new MyRunnable1());
        thread.start();
        thread1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main 안녕 !");
        }
        System.out.println("main 종료!");
    }

}
