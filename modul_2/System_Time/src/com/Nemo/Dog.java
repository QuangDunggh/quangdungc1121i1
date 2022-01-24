package com.Nemo;

public class Dog extends Animals implements Runable {

    public Dog(String color, String name) {
        super(color, name);
    }

    public void getBark() {
        System.out.println("Gâu gâu gâu gâu ...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void howToRun() {
        System.out.println("Chạy bằng bốn chân");
    }
}
