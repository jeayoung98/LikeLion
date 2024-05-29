package com.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SchoolExMain {
    public static void main(String[] args) {
        create();
//        try {
////            School school = manager.find(School.class, 1L);
////            log.info("School Name : {}", school.getName());
////
////            for (Student student : school.getStudents()) {
////                log.info("Student Name : {}",student.getName());
////            }
//            Student student = manager.find(Student.class, 5L);
//            log.info("Student Name : " + student.getName());
//            log.info("School Name : " + student.getSchool());
//        }finally {
//            manager.close();
//        }
    }
    private static void create() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            School school = new School("대진고");

            Student student1 = new Student("jung", school);
            Student student2 = new Student("hong", school);
            Student student3 = new Student("kim", school);

            school.getStudents().add(student1);
            school.getStudents().add(student2);
            school.getStudents().add(student3);

            manager.persist(school);
            manager.getTransaction().commit();
        }finally {
            manager.close();
        }
    }

    public static void update(){
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try{
            School school = manager.find(School.class, 3L);
            school.setName("update School Name");
            manager.getTransaction().commit();
        } finally {
            manager.close();
        }
    }

    private static void delete() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            School school = manager.find(School.class, 1L);
            manager.remove(school);

            manager.getTransaction().commit();
        }finally {
            manager.close();
        }
    }
}
