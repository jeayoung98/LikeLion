package com.example.day10.practice;

public class CarExMain {
    public static void main(String[] args) {
        CarEx carEx = new CarEx("Hyundai", "Genesis", 2022);
        carEx.displayInfo();

        ElectricCarEx electricCarEx = new ElectricCarEx("Tesla", "Model S", 2021, 75);
        electricCarEx.displayInfo();
    }
}
