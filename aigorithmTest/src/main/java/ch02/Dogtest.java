package ch02;

public class Dogtest {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.breed = "Labrador";
        myDog.age = 5;
        myDog.color = "Brown";
        myDog.bark();
        myDog.displayInfo();
    }
}
