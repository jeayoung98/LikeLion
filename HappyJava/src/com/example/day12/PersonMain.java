package com.example.day12;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person(1001, "Jung");
        System.out.println("사람의 ID : " + person.getId());
        System.out.println("사람의 이름 : " + person.getName());
        person.setName("jeayoung");
        System.out.println("변경된 이름 : " + person.getName());
    }
}
