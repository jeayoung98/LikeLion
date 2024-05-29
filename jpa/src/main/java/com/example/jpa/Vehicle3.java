package com.example.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Vehicle2")
@Setter @Getter
public class Vehicle3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturer;
}

@Entity
@Table(name = "Car3")
@Setter @Getter
class Car3 extends Vehicle2 {
    private int seatCount;

}

@Entity
@Table(name = "Truck3")
@Setter @Getter
class Truck3 extends Vehicle2 {
    private double payloadCapacity;
}