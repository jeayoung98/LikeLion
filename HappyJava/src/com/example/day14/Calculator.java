package com.example.day14;

public class Calculator<T extends Number> {
    public static void main(String[] args) {
        Calculator<Integer> intCal = new Calculator<>(5);
        Calculator<Double> doubleCal = new Calculator<>(5.5);
        System.out.println("intCal = " + intCal.square());
        System.out.println("doubleCal = " + doubleCal.square());
    }
    private T num;

    public Calculator(T num) {
        this.num = num;
    }
    public double square() {
        return Math.pow(num.doubleValue(),2);
    }



}
