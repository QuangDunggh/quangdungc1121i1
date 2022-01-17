package com.ExampleForTunglz;

public class Circle extends Shape implements Resizeable,Comparable<Circle> {
    private double radius;

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " and have " + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích trước khi tăng là: "
                + getArea() + " diện tích sau khi tăng là: " + (getArea() + getArea() * percent / 100));
    }

    @Override
    public int compareTo(Circle o) {
        int result;
        if (this.getArea() - o.getArea() < 0) {
            result = -1;
        } else if (this.getArea() - o.getArea() > 0) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }
}
