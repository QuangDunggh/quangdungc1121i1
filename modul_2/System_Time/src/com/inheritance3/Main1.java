package com.inheritance3;

import com.inheritance4.Circle;

public class Main1 {
    public static void main(String[] args) {
        Shapes shapes = new Shapes("Red", true);

        Triangle triangle = new Triangle("blue", true, "triangle", 3.0, 4.0, 6.0);


        Shapes triangle1 = new Triangle("triangle1", 3.0, 8.0, 9.0);
        Triangle triangle2 = (Triangle) triangle1;
        ((Triangle) triangle1).getArea();
        triangle2.getArea();
        System.out.println(triangle);
        System.out.println(triangle2);

    }
}
