package com.inheritance;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2.0, 4.0, "red", true);
        System.out.println(rectangle);

        Rectangle square = new Square(3.0);
        System.out.println(square.getArea());

        Circle circle = new Circle("yellow", false, 9.0);
        System.out.println("Doi tuong cua lop circle");
        System.out.println(circle);
    }
}
