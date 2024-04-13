package com.example.day13;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;
        Point point  = (Point) object;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return 31*x + y;
    }
}

