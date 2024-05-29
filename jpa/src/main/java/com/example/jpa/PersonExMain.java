package com.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonExMain {
    public static void main(String[] args) {
//        create();
//        find();
//        delete();
        update();
    }

    private static void create() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            Person person = new Person();
            person.setName("jung");

            Passport passport = new Passport();
            passport.setPassportNumber("A89989998");

            person.setPassport(passport); // Person 객체에 Passport 객체 설정
            passport.setPerson(person); // Passport 객체에 Person 객체 설정

            manager.persist(person); // Person 객체를 persist, Passport는 cascade 설정 때문에 자동으로 persist됨

            manager.getTransaction().commit();
        } catch (Exception e) {
            if (manager.getTransaction().isActive()) {
                manager.getTransaction().rollback();
            }
            throw e;
        } finally {
            manager.close();
        }
    }

    private static void find(){
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try{
            Person person = manager.find(Person.class, 3L);
            log.info(person.getName());
            log.info(person.getPassport().getPassportNumber());

            Passport passport = manager.find(Passport.class, 3L);
            log.info(passport.getPassportNumber());
            log.info(passport.getPerson().getName());

            manager.getTransaction().commit();
        }finally {
            manager.close();
        }
    }

    private static void delete() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try{
            Person person = manager.find(Person.class, 3L);
            manager.remove(person);

            manager.getTransaction().commit();
        }finally {
            manager.close();
        }
    }

    private static void update() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try{
            Person person = manager.find(Person.class, 1L);
            person.setName("hong");

            // passport 만 삭제
            Passport passport = manager.find(Passport.class, 1L);
            if (passport != null) {
                passport.getPerson().setPassport(null);
            }
            manager.remove(passport);
            manager.getTransaction().commit();
        }finally {
            manager.close();
        }
    }
}
