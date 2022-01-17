package com.Abstract2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle("9", "bed", 6.0, false);
        Circle circle2 = new Circle("2", "arown", 5.9, true);
        Circle circle3 = new Circle("2", "arown", 15.9, true);
        Circle circle4 = new Circle("2", "arown", 6.9, true);
        Circle[] arrayCircle = {circle1, circle2, circle3, circle4};
        Comparator circleComparator = new CircleComparator();
//        circle1.compareTo(circle2);
//        System.out.println("Before Sort: ");
//        for (Circle item : arrayCircle) {
//            System.out.println(item);
//        }
//        System.out.println("After sort: ");
//        Arrays.sort(arrayCircle);
//        for (Circle item : arrayCircle) {
//            System.out.println(item);
//        }
        System.out.println(circle1);
        System.out.println(circle1.howToColor());
        circle1.resize(34);

   }
}



