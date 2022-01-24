package com.Nemo;

import com.ExampleForTunglz.Circle;

public abstract class Machine {
    protected String color;
    protected String shape;

    public Machine(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }
}
