package com.example.day17;

public class Robot {
    public synchronized void methodA() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Robot A : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void methodB() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Robot B : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void methodC() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Robot C : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}