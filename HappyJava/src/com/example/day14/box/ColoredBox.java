package com.example.day14.box;

public class ColoredBox<T, C> extends Box2<T> {
    private C color;

    public ColoredBox(T content, C color) {
        super(content);
        this.color = color;
    }

    public C getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Colored box with color " + color + " containing : " + getContent();
    }
}
