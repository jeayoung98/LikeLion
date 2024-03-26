package com.example.day10;

public class Test3 {

    public static void main(String[] args) {
        // 1. 부모는 자식을 가리킬 수 있다.
        // 조상은 자손은 가리킬 수 있다.
        Parent p = new Child();
        Object obj = new Child();
        Object obj2 = new Parent();


        // 형 변환 필요
        System.out.println(((Child)obj).i);
        System.out.println(((Child)obj).getI());

        Child c = (Child)obj;
        System.out.println(c.i);
        System.out.println(c.getI());





    }
}
