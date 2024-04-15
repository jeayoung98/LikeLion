package com.example.day14.box;

import com.example.day14.Box;


class SpecialBox<T> extends Box2<T> {
    public SpecialBox(T content) {
        super(content);
    }

    public void printContent() {
        System.out.println("Special box contains " + getContent());
    }
}

