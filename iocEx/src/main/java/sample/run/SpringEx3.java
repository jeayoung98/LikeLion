package sample.run;

import sample.bean.Book;
import sample.config.BookConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEx3 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);

        Book book = context.getBean("b",Book.class);
        book.setTitle("java");
        book.setPrice(30000);

        System.out.println(book.getTitle());
    }
}
