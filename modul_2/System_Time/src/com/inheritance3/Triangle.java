package com.inheritance3;

public class Triangle extends Shapes {
    private double slide1 = 1.0;
    private double slide2 = 1.0;
    private double slide3 = 1.0;
    private String name;

    public Triangle() {
    }

    public Triangle(String name, double slide1, double slide2, double slide3) {
        this.name = name;
        this.slide1 = slide1;
        this.slide2 = slide2;
        this.slide3 = slide3;
    }

    public Triangle(String color, boolean filled, String name, double slide1, double slide2, double slide3) {

        super(color, filled);
        this.name = name;
        this.slide1 = slide1;
        this.slide2 = slide2;
        this.slide3 = slide3;
    }

    public double getSlide1() {
        return slide1;
    }

    public void setSlide1(double slide1) {
        this.slide1 = slide1;
    }

    public double getSlide2() {
        return slide2;
    }

    public void setSlide2(double slide2) {
        this.slide2 = slide2;
    }

    public double getSlide3() {
        return slide3;
    }

    public void setSlide3(double slide3) {
        this.slide3 = slide3;
    }

    public double getArea() {
        double p = (1.0 / 2) * (slide1 + slide2 + slide3);
        double s = p * (p - slide1) * (p - slide2) * (p - slide3);
        return Math.pow(s, 0.5);
    }

    public double getPerimeter() {
        return slide1 + slide2 + slide3;
    }

    @Override
    public String toString() {
        return "Đây là lớp Triangle, tam giác có tên là: " + name + " có 3 cạnh lần lượt là: " + slide1 +
                " ," + slide2 + " ," + slide3 + " có diện tích là: " + getArea() +
                " và có chu vi là: " + getPerimeter();
    }
}
