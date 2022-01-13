package com.inheritance4;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Yellow", false);
        System.out.println(shape);

        Circle circle = new Circle(3.0,"blue",true);
        circle.getArea();
        System.out.println(circle);
        circle.isFilled();
        System.out.println(circle.getColor());
        Circle.test();
    }
}
