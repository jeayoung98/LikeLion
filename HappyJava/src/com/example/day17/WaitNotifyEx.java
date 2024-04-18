package com.example.day17;

public class WaitNotifyEx {
    private static final Object lock = new Object();
    private static boolean itemAvailable = false;

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        consumer.start();
        try {
            Thread.sleep(1000); // 생산자 시작 전 잠시 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }producer.start();
    }

    static class Producer extends Thread {
        public void run() {
            synchronized (lock) {
                System.out.println("생산자가 아이템을 생산 중입니다.");
                itemAvailable = true;
                lock.notify(); // 생산이 끝났으므로 소비자에게 알림
                System.out.println("생산자가 알림을 보냈습니다.");
            }
        }
    }

    static class Consumer extends Thread {
        public void run() {
            synchronized (lock) { // lock 의 소유권을 가짐
                while (!itemAvailable) {
                    try {
                        System.out.println("소비자가 아이템을 기다리고 있습니다.");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("소비자가 아이템을 소비했습니다.");
                itemAvailable = false;
            }
        }
    }
}
