package com.ClassAndOOps;

public class Rectangle {
    public double width;
    public double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void getArea() {
        System.out.println("Area of rectangle is: " + (this.height) * (this.width));
    }
    public void getPerimeter() {
        System.out.println("Area of rectangle is: " + ((this.height) + (this.width)) * 2);
    }
    public void display() {
        System.out.println("Width: " + this.width + " Height: " + this.height);
    }
}
