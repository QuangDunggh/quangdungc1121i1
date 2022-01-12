//package com.ClassAndOOps;
//
//public class Fan {
//     static final int SLOW = 1;
//     static final int MEDIUM = 3;
//     static final int QUICK = 5;
//    private int speed = SLOW;
//    private double radius = 5;
//    private boolean on = true;
//    private String color = "Blue";
//    public Fan() {}
//    public Fan(int speed,double radius,boolean on, String color ) {
//        this.speed = speed;
//        this.radius = radius;
//        this.on = on;
//        this.color = color;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    public boolean isOn() {
//        return on;
//    }
//
//    public void setOn(boolean on) {
//        this.on = on;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    @Override
//    public String toString() {
//        return "Fan{" +
//                " speed=" + speed +
//                ", radius=" + radius +
//                 "," + (on  ? " Fan is on" : " Fan is off")  +
//                ", color='" + color + '\'' +
//                '}';
//    }
//}
