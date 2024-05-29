package com.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployeeExMain {
    public static void main(String[] args) {
//        find();
//        create();
    }

    private static void find() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            Employee employee = manager.find(Employee.class, 1L);
            log.info("직원 이름 : {}",employee.getName());

            Project project = manager.find(Project.class,2L);
            log.info("프로젝트 이름 : {}",project.getName());
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

    private static void create() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            Employee employee = new Employee();
            employee.setName("jung");

            Project project = new Project();
            project.setName("lion project");

            employee.getProjects().add(project);
            project.getEmployees().add(employee);

            manager.persist(employee);
            manager.persist(project);

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

    private static void delete() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            Employee employee = manager.find(Employee.class, 2L);
            manager.remove(employee);

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

    private static void update() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            Project project = manager.find(Project.class, 1L);
            project.setName("hi");
            Employee employee = manager.find(Employee.class, 2L);
            employee.getProjects().remove(project);
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
}
