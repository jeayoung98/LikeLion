package com.example.day10.practice;

public class CarEx {
    String brand;
    String model;
    int year;
    public CarEx() {

    }

    public CarEx(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.printf("브랜드 : %s, 모델 : %s, 연식 : %d\n",brand,model,year);
    }

}
