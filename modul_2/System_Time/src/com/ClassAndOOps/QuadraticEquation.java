//package com.ClassAndOOps;
//
//import java.util.Scanner;
//
//public class QuadraticEquation {
//    private double a;
//    private double b;
//    private double c;
//
//    public QuadraticEquation(double a, double b, double c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }
//
//    public double getDiscriminant() {
//        double delta = b * b - 4 * a * c;
//        return delta;
//
//    }
//
//    public double getRoot1() {
//        double r1 = (-b + Math.pow((b * b - 4 * a * c), 0.5)) / 2 * a;
//        return r1;
//    }
//    public double getRoot2() {
//        double r2 = (-b - Math.pow((b * b - 4 * a * c), 0.5)) / 2 * a;
//        return r2;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a, b, c: ");
//        double a = Double.parseDouble(input.nextLine());
//        double b = Double.parseDouble(input.nextLine());
//        double c = Double.parseDouble(input.nextLine());
//        QuadraticEquation newObject = new QuadraticEquation(a, b, c);
//        if (newObject.getDiscriminant() > 0 ) {
//            System.out.println(newObject.getRoot1());
//            System.out.println(newObject.getRoot2());
//        } else if (newObject.getDiscriminant() == 0) {
//            System.out.println(newObject.getRoot2());
//        } else {
//            System.out.println("Phuong trinh vo nghiem");
//        }
//
//    }
//}
