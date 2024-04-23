package com.example.day18.babyLion;

public class ThreadEx1 {
    public static void main(String[] args) {
        System.out.println("main 시작");
        myThread thread = new myThread();
        myRunnable runnable = new myRunnable();
        Thread thread1 = new Thread(runnable);
        thread.start();
        thread1.start();
        System.out.println("main 끝");
    }
}

class myThread extends Thread {
    @Override
    public void run() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("스레드에서 실제 하고자 하는 일 구현 !");
    }
}

class myRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("스레드에서 실제 하고자 하는 일 구현 !!");
    }
}