package com.inheritance3;

public class Main {
    public static void main(String[] args) {
//        Point point = new Point(3.0f, 9.0f);
//        System.out.println(point);
        MoveAblePoint moveAblePoint = new MoveAblePoint(6.0f,8.6f,9.3f,10.0f);
        System.out.println(moveAblePoint.move());
    }
}
