package com.example.day09;

public class ClassA {

    public static int field; // 클래스 빌드
    public int filedB; //인스턴스 필드
    int count;
    protected int number;
    private String address;
    public String name;

    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println(a.address);
        System.out.println(a.count);
        System.out.println(a.number);
        System.out.println(a.name);
    }
}
