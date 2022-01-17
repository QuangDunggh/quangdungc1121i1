package com.AbstractAndInterface;

public class Orange extends Fruit implements Edible{
    private String name;
    @Override
    public String howToEat() {
        return "Cắt ra và ăn";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
