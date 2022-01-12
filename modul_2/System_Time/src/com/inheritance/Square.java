package com.inheritance;

public class Square extends Rectangle {
    private double size = 1.0;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea() {
        return size * size;
    }

    public double getPerimeter() {
        return 4.0 * size;
    }

    @Override

    public String toString() {
        return "Square{" +
                "size=" + size + "which is subclass of " + super.toString() +
                '}';
    }
}
