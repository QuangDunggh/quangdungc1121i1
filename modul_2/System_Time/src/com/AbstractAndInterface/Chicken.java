package com.AbstractAndInterface;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return " Cuc ta cuc tac";
    }

    @Override
    public String howToEat() {
        return " Làm thịt và ăn";
    }
}
