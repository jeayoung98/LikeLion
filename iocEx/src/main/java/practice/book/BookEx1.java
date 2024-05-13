package practice.book;

import org.springframework.stereotype.Component;


public class BookEx1 {
    // 프로그래머가 직접 인스턴스 생성 사용
    public static void main(String[] args) {
        Book book = new Book("java", 10000);
        System.out.println(book.getPrice());
        System.out.println(book.getTitle());
    }

}
