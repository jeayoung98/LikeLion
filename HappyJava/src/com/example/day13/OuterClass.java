package com.example.day13;

public class OuterClass {
    private int outerField = 10;
    public void outerMethod() {
        InnerClass innerClass = new InnerClass();
        innerClass.InnerMethod();
    }
    class InnerClass{
        public void InnerMethod() {
            System.out.println("outerFiled = " + outerField);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();

    }
}
