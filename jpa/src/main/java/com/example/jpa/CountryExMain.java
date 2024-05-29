package com.example.jpa;

import jakarta.persistence.EntityManager;

public class CountryExMain {
    public static void main(String[] args) {
        create();
    }

    public static void create() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            Region region = new Region("Asia");

            Country country1 = new Country("KR", "Korea", region);
            Country country2 = new Country("JP", "Japan", region);

            region.getCountries().add(country1);
            region.getCountries().add(country2);

            manager.persist(region);
            manager.persist(country1);
            manager.persist(country2);

            manager.getTransaction().commit();
        }finally {
            manager.close();
        }
    }
}
