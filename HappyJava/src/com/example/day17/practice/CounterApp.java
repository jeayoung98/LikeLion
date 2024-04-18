package com.example.day17.practice;

public class CounterApp {
    public static void main(String[] args) {
        Incrementcounter incrementcounter = new Incrementcounter();
        DecrementCounter decrementCounter = new DecrementCounter();

        incrementcounter.start();
        decrementCounter.start();
    }


    static class Incrementcounter extends Thread {

        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Increment : {" + i + "}");
            }
        }
    }

    static class DecrementCounter extends Thread {

        public void run() {
            for (int i = 100; i >= 1; i--) {
                System.out.println("Decrement : {" + i + "}");
            }
        }
    }

}
