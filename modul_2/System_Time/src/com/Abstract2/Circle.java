package com.Abstract2;

public class Circle implements Comparable<Circle>,ColorAble,Resizeable {
    private String color;
    private double radius;
    private boolean filled;
    private String name;

    public Circle(String name, String color, double radius, boolean filled) {
        this.name = name;
        this.color = color;
        this.radius = radius;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" + name + " " +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", filled=" + filled +
                '}' + howToColor();
    }

    @Override
    public int compareTo(Circle o) {
        double result = (this.getArea() - o.getArea());
        return result == 0 ? 0 : result > 0 ? 1 : -1;
    }

    @Override
    public String howToColor() {
       return "Duoc to mau";
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hiện tại là: "
                + getArea() + " và diện tích sau khi tăng là: " + (getArea()* (percent/100) + getArea()));
    }
}
