package com.inheritance4;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
//        this.radius = radius;
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }



    @Override
    public String toString() {
        return "Đây là lớp Circle, đối tượng có bán kính là: " + radius + " có màu: " + super.getColor() +

                " và là lớp con của " + super.toString();
    }
    @Override
    public String getColor(){
        return "Đây cũng là một phương thức ghi đè của thằng con " + super.getColor() ;
    }


}
