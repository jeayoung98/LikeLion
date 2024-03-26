package com.example.day09;

public class ClassTest {
    public void print(ClassB classb) {
        System.out.println(classb.name);
//        System.out.println(classb.flag);
//        System.out.println(classb.address);
//        System.out.println(classb.age);
    }

    public static void main(String[] args) {
        ClassTest classTest = new ClassTest();
        classTest.print(new ClassB());
    }

}
