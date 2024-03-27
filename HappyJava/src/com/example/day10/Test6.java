package com.example.day10;

import java.util.Arrays;

class bird {
    public void say() {
        System.out.println("??");
    }
}

class parrot extends bird {
    public void say() {
        System.out.println("안녕 @@");
    }
}

class Sparrow extends bird {
    public void say() {
        System.out.println("짹짹@@");
    }
}

class pigeon extends bird {
    public void say() {
        System.out.println("구구@@");
    }
}

public class Test6 {
    public static void main(String[] args) {
        bird bird = null;
        if (args[0].equals("앵무새")) {
            bird = new parrot();
        } else if (args[0].equals("참새")) {
            bird = new Sparrow();
        } else {
            bird = new pigeon();
        }
        bird.say();

    }

}
