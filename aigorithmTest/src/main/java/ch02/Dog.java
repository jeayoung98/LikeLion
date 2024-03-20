package ch02;

public class Dog {
    //필드
    String breed;
    int age;
    String color;

    //메서드
    void bark() {
        System.out.println("woof!");
    }
    void displayInfo() {
        System.out.println("Breed : " + breed + "\nAge : " + age + "\nColor : " + color);
    }
}
