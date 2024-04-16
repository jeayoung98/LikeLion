package com.example.day15;

import java.util.Objects;

public class Pen {
    String color;

    public Pen(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + " pen";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Pen pen = (Pen) object;
        return Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
