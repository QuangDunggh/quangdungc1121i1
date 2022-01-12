package com.inheritance1;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3.0, "red", 3.0);
        System.out.println(cylinder);
        Circle cylinder1 = new Circle(3.0, "yellow");
        System.out.println(cylinder1);
        System.out.println("Area of cylinder: " + cylinder.getArea());
        System.out.println("Volume of cylinder: " + cylinder.getVolume());
    }
}
