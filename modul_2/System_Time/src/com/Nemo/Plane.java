package com.Nemo;

public class Plane extends Machine implements Flyable{
    private String label;
    public Plane(String color, String shape) {
        super(color, shape);
    }

    public Plane(String color, String shape, String label) {
        super(color, shape);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "label='" + label + '\'' +
                '}';
    }

    @Override
    public void howToFly() {
        System.out.println("Bay bằng dầu diazen, dựa vào động cơ");
    }
}
