package com.example.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person>{
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("jung", 27));
        list.add(new Person("hong", 28));
        list.add(new Person("kim", 26));

        System.out.println(list);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println(list);
    }
    private String name;
    private int age;
    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }

    @Override
    public int compareTo(Person o) {
//        return this.age - o.age;
        return this.name.compareTo(o.name);
    }
}
