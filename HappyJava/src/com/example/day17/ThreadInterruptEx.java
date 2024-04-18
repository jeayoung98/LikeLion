package com.example.day17;

public class ThreadInterruptEx {
    static class MyThread extends Thread {
        public static void main(String[] args) {
            MyThread t = new MyThread();
            t.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            t.interrupt(); // thread 에 인터럽트 중지 신호 보내기
        }
        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);
                    System.out.println("Processing step" + (i + 1));
                }
            } catch (InterruptedException e) {
                System.out.println("Thread 가 중지 되었습니다.");
            }
        }
    }
}
