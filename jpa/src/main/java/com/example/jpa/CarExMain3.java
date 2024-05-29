package com.example.jpa;

import jakarta.persistence.EntityManager;

public class CarExMain3 {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();

        // 데이터 삽입
        em.getTransaction().begin();

        Car3 car1 = new Car3();
        car1.setManufacturer("Toyota");
        car1.setSeatCount(5);
        em.persist(car1);

        Car3 car2 = new Car3();
        car2.setManufacturer("Honda");
        car2.setSeatCount(4);
        em.persist(car2);

        Truck3 truck1 = new Truck3();
        truck1.setManufacturer("Volvo");
        truck1.setPayloadCapacity(15.5);
        em.persist(truck1);

        Truck3 truck2 = new Truck3();
        truck2.setManufacturer("Scania");
        truck2.setPayloadCapacity(20.0);
        em.persist(truck2);

        em.getTransaction().commit();
    }
}
