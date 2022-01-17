package com.AbstractAndInterface;

public abstract class Fruit {

    protected String color;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return " Có màu: " + color;
    }
}
