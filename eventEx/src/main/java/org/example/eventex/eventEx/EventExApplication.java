package org.example.eventex.eventEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventExApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EventExApplication.class, args);
    }

    @Autowired
    private CustomEventPublisher customEventPublisher;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("test");
        customEventPublisher.publisherEvent("hello");
    }
}
