package com.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class CarExMain2 {
    public static void main(String[] args) {
        create();
    }

    public static void create() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            Car2 car1 = new Car2();
            car1.setSeatCount(6);
            car1.setManufacturer("Toyota");
            manager.persist(car1);

            Car2 car2 = new Car2();
            car2.setSeatCount(5);
            car2.setManufacturer("hyundai");
            manager.persist(car2);

            Car2 car3 = new Car2();
            car3.setSeatCount(4);
            car3.setManufacturer("kia");
            manager.persist(car3);

            Truck2 truck1 = new Truck2();
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
            Vehicle2 vehicle2 = manager.find(Vehicle2.class, 1L);
            if (vehicle2 instanceof Car2) {
                Car2 car = (Car2) vehicle2;
                log.info("Car info : {} {}",car.getManufacturer(),car.getSeatCount());
            }
            else if (vehicle2 instanceof Truck2) {
                Truck2 truck = (Truck2) vehicle2;
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
            List<Vehicle2> selectVFromVehicle2V = manager.createQuery("SELECT v FROM Vehicle2 v", Vehicle2.class).getResultList();
            for (Vehicle2 vehicle2 : selectVFromVehicle2V) {
                if (vehicle2 instanceof Car2) {
                    Car2 car = (Car2) vehicle2;
                    log.info("Car info : {} {}",car.getManufacturer(),car.getSeatCount());
                }
                else if (vehicle2 instanceof Truck2) {
                    Truck2 truck = (Truck2) vehicle2;
                    log.info("Truck infO : {} {}",truck.getManufacturer(),truck.getPayloadCapacity());
                }
            }
            manager.getTransaction().commit();
        }finally {
            manager.close();
        }
    }
}
