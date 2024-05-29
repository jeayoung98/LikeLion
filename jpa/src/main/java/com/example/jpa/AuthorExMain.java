package com.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthorExMain {
    public static void main(String[] args) {
//        create();
//        update();
        read();
    }


    private static void create() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            Author author = new Author("hong");

            Book book1 = new Book("배워서 바로 쓰는 스프링 부트2", author);
            Book book2 = new Book("시원스쿨 토익 실전 1500제", author);
            Book book3 = new Book("수학의 정석", author);

            author.getBooks().add(book1);
            author.getBooks().add(book2);
            author.getBooks().add(book3);

            manager.persist(author);
            manager.getTransaction().commit();
        }finally {
            manager.close();
        }
    }

    private static void update() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            Author author = manager.find(Author.class, 1L);
            author.setName("hong");

            manager.getTransaction().commit();
        }finally {
            manager.close();
        }
    }

    private static void delete() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            Author author = manager.find(Author.class, 2L);
            manager.remove(author);

            manager.getTransaction().commit();
        }finally {
            manager.close();
        }
    }

    private static void read() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            Author author = manager.find(Author.class, 1L);
            log.info("Author Name : {}", author.getName());

            Book book = manager.find(Book.class, 1L);
            log.info("Book Title : {}", book.getTitle());
        }finally {
            manager.close();
        }
    }

    private static void readAll() {
        EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
        manager.getTransaction().begin();
        try {
            Author author = manager.find(Author.class, 1L);
            for (Book book : author.getBooks()) {
                log.info("Book Name : {}", book.getTitle());
            }
//
//
//            Book book = manager.find(Book.class, 1L);
//            for(Author author1:book.getAuthor()) {
//                log.info("Book Title : {}", author1.getBooks());
//            }
        }finally {
            manager.close();
        }
    }
}
