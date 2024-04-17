package com.example.day16.practice;

import java.io.Serializable;

public class HpInfo implements Serializable {
    private String name;
    private String hp;

    public HpInfo(String name, String hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public String getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return name + " " + hp;
    }
}
