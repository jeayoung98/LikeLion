package org.example.eventex.eventEx2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventEx2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EventEx2Application.class, args);
    }

    @Autowired
    private CustomEventPublisher customEventPublisher;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("test");
        System.out.println("EvnetEx2Application Thread Name ::"+Thread.currentThread().getName());
        customEventPublisher.publisherEvent("hello");
    }
}
