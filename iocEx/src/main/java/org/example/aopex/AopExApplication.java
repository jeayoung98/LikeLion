package org.example.aopex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopExApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(AopExApplication.class,args);
    }

    @Autowired
    SimpleService service;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("run test!");
        service.doSomething();
        service.hello();
        service.setName("jung");
    }
}
