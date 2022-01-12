package com.inheritance2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.0f, 5.0f);
        System.out.println(point2D);

        Point3D point3D = new Point3D(3.0f,4.0f, 6.0f);

        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
    }
}
