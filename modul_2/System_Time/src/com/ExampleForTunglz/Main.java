package com.ExampleForTunglz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red", false, 19.0);
        Circle circle1 = new Circle("brown", true, 13.0);
        Circle circle2 = new Circle("yellow", false, 14.8);
        Circle circle3 = new Circle("blue", true, 13.9);
        System.out.println( ((Circle)circle1).compareTo((Circle)circle3));
        Circle[] arr = {(Circle) circle, (Circle) circle1, (Circle) circle2, (Circle) circle3};
//        System.out.println("Before sort: ");
//        for (Circle item: arr) {
//            System.out.println(item);
//        }
//        Arrays.sort(arr);
//        System.out.println("After sort: ");
//        for (Circle item: arr) {
//            System.out.println(item);
//        }
        compareObj(circle,circle2);
    }

    private static void compareObj(Circle cir1, Circle cir2) {
        if (cir1.compareTo(cir2) > 0) {
            System.out.println("Dũng là bố của Tùng");
        } else if (cir1.compareTo(cir2) < 0) {
            System.out.println("Tùng là con của Dũng");
        } else {
            System.out.println("Tùng tuổi lz");
        }
    }

}
