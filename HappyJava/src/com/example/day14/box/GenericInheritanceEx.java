package com.example.day14.box;

public class GenericInheritanceEx {
    public static void main(String[] args) {
        SpecialBox<String> stringSpecialBox = new SpecialBox<>("Hi");
        stringSpecialBox.printContent();

        ColoredBox<String, String> box = new ColoredBox<>("Hello", "red");
        System.out.println(box);
    }
}
