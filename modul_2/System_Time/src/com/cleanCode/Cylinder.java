package com.cleanCode;

public class Cylinder {
    public static void main(String[] args) {
        System.out.println(getVolume(4, 5));
    }
    public static double getVolume(int radius, int height){
        double volume = getPerimeter(radius) * height + 2 * getArea(radius);
        return volume;
    }

    private static double getPerimeter(int radius) {
        double perimeter = 2 * Math.PI  * radius;
        return perimeter;
    }

    private static double getArea(int radius) {
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }
}
