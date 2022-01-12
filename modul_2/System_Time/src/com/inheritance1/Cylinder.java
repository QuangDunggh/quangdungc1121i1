package com.inheritance1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.height * super.getArea();
    }

    @Override

    public String toString() {
        return "This is Cylinder, which is height = " + this.height + " and is subclass of " + super.toString();
    }
}
