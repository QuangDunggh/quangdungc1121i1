package com.inheritance;

public class Shape {
    private String color = "Green";
    private boolean filled = true;
    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getFilled() {
        return this.filled;
    }

    @Override
    public String toString() {
        return "The Shape with color of " + this.color + " and " + (filled ? "filled" : "not filled");
    }
}
