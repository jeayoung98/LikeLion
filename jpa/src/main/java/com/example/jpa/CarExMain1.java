package com.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class CarExMain1 {
    public static void main(String[] args) {
        find();
    }

    public static void create() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            Car car1 = new Car();
            car1.setSeatCount(6);
            car1.setManufacturer("Toyota");
            manager.persist(car1);

            Car car2 = new Car();
            car2.setSeatCount(5);
            car2.setManufacturer("hyundai");
            manager.persist(car2);

            Car car3 = new Car();
            car3.setSeatCount(4);
            car3.setManufacturer("kia");
            manager.persist(car3);

            Truck truck1 = new Truck();
            truck1.setManufacturer("Volvo");
            truck1.setPayloadCapacity(20.0);
            manager.persist(truck1);

            manager.getTransaction().commit();
        }finally {
            manager.close();
        }
    }

    public static void find() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            Vehicle vehicle2 = manager.find(Vehicle.class, 1L);
            if (vehicle2 instanceof Car) {
                Car car = (Car) vehicle2;
                log.info("Car info : {} {}",car.getManufacturer(),car.getSeatCount());
            }
            else if (vehicle2 instanceof Truck) {
                Truck truck = (Truck) vehicle2;
                log.info("Truck infO : {} {}",truck.getManufacturer(),truck.getPayloadCapacity());
            }
            manager.getTransaction().commit();
        }finally {
            manager.close();
        }
    }

    public static void findAll() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            List<Vehicle> selectVFromVehicle2V = manager.createQuery("SELECT v FROM Vehicle v", Vehicle.class).getResultList();
            for (Vehicle vehicle2 : selectVFromVehicle2V) {
                if (vehicle2 instanceof Car) {
                    Car car = (Car) vehicle2;
                    log.info("Car info : {} {}",car.getManufacturer(),car.getSeatCount());
                }
                else if (vehicle2 instanceof Truck) {
                    Truck truck = (Truck) vehicle2;
                    log.info("Truck infO : {} {}",truck.getManufacturer(),truck.getPayloadCapacity());
                }
            }
            manager.getTransaction().commit();
        }finally {
            manager.close();
        }
    }
}
