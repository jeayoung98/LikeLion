package com.example.day15.practice.book;

import java.util.*;

public class BookManager {
    private List<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            System.out.println(book.getTitle() + "이(가) 추가되었습니다.");
        } else {
            System.out.println(book.getTitle() + "은(는) 이미 목록에 있습니다.");
        }
    }

    public void removeBook(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(title)) {
                iterator.remove();
                System.out.println(book.getTitle() + "이(가) 삭제되었습니다.");
                return;
            }
        }
        System.out.println(title + "은(는) 목록에 없습니다.");
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("검색 결과: " + book);
                return;
            }
        }
        System.out.println(title + "은(는) 목록에 없습니다.");
    }

    public void displayBooks() {
        System.out.println("도서 목록:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void sortBooksByYear() {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getYear()- o2.getYear();
            }
        });
        System.out.println("출판년도순 정렬 결과:");
        displayBooks();
    }
}
