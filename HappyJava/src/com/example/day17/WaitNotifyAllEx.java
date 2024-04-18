package com.example.day17;

public class WaitNotifyAllEx {
    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer1 = new Consumer(1);
        Consumer consumer2 = new Consumer(2);
        Consumer consumer3 = new Consumer(3);

        consumer1.start();
        consumer2.start();
        consumer3.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }producer.start();
    }

    private static final Object lock = new Object();
    private static int itemAvailable = 0;

    static class Producer extends Thread {
        public void run(){
            synchronized (lock) {
                itemAvailable +=5;
                System.out.println("생산자가 " + itemAvailable + "개의 아이템을 생산했습니다.");
                lock.notifyAll();
                System.out.println("생산자가 모든 소비자에게 알림을 보냈습니다.");
            }
        }
    }
    static class Consumer extends Thread {
        private int id;

        Consumer(int id) {
            this.id = id;
        }
        public void run(){
            synchronized (lock) {
                while (itemAvailable >= 0) {
                    try {
                        System.out.println("소비자 " + id + "가 아이템을 기다리고 있습니다.");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }itemAvailable--;
                System.out.println("소비자 " + id + "가 아이템을 소비했습니다. 남은아이템 : " + itemAvailable);

            }
        }
    }
    }
