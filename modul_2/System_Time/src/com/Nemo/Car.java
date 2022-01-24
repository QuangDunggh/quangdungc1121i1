package com.Nemo;

public class Car extends Machine implements Runable{
    private double giaToc;
    private int soBanh;
    public Car(String color, String shape) {
        super(color, shape);
    }

    public Car(String color, String shape, double giaToc, int soBanh) {
        super(color, shape);
        this.giaToc = giaToc;
        this.soBanh = soBanh;
    }

    public double getGiaToc() {
        return giaToc;
    }

    public void setGiaToc(double giaToc) {
        this.giaToc = giaToc;
    }

    public int getSoBanh() {
        return soBanh;
    }

    public void setSoBanh(int soBanh) {
        this.soBanh = soBanh;
    }

    @Override
    public String toString() {
        return "Car{" +
                "giaToc=" + giaToc +
                ", soBanh=" + soBanh +
                '}';
    }

    @Override
    public void howToRun() {
        System.out.println("Chạy bằng xăng, có bánh xe");
    }
}
