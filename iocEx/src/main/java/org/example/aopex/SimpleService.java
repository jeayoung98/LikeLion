package org.example.aopex;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {
    public String doSomething(){
        //핵심관심. target
        System.out.println("SimpleService doSomething run");
        return "Doing something...";
    }

    public void hello(){
        System.out.println("hello method run@@@");
        if (true) {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setName(String name) {
        System.out.println("setName() method run ");
    }

}
