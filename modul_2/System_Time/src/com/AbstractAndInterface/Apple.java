package com.AbstractAndInterface;

public class Apple extends Fruit implements Edible{
    @Override
    public String howToEat() {
        return "Cắt và bịch nó";
    }

    @Override
    public String toString() {
        return super.toString() + " Ăn bằng cách: " + howToEat();
    }
}
