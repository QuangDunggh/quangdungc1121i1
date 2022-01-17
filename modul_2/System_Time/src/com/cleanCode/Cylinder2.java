package com.cleanCode;

public class Cylinder2 {

    public static final double PI = Math.PI;

    public double getVolume(int radius, int height){
        return getPerimeter(radius ) * height + 2 * getArea(radius);
    }

    private double getPerimeter(int radius) {
        return  2 * PI * radius;
    }

    private double getArea(int radius) {
        return PI * radius * radius;
    }
}
