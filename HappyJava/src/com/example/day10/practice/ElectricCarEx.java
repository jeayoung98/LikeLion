package com.example.day10.practice;

import java.util.Objects;

public class ElectricCarEx extends CarEx {
    int battery;
    public ElectricCarEx(String brand, String model, int year,int battery) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.battery = battery;
    }

    @Override
    public void displayInfo() {
        System.out.printf("브랜드 : %s, 모델 : %s, 연식 : %d, 배터리 : %d\n",brand,model,year,battery);
    }

}
