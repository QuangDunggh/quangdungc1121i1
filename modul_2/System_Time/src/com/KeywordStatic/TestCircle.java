package com.KeywordStatic;

public class TestCircle {
    private double radius = 1.0;
    private String color = "red";

    public TestCircle() {
    }

    public TestCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        TestCircle circle = new TestCircle(6.0);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
