package com.example.day11;
abstract public class Figure {
    abstract public double area();
}


class Triangle extends Figure{
        private int w, h;
        public Triangle(int w, int h) {
            this.w = w;
            this.h = h;
        }
        @Override
        public double area() {
            return 0.5 * w * h;
        }
    }

    class Square extends Figure{
        private int w, h;
        public Square(int w, int h) {
            this.w = w;
            this.h = h;
        }
        @Override
        public double area() {
            return w * h;
        }
    }

