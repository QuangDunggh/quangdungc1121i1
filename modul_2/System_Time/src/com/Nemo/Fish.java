package com.Nemo;

public class Fish extends Animals {
    public Fish(String color, String name) {
        super(color, name);
    }

    public void swimAble() {
        System.out.println("I can swim!!!");
    }

    @Override
    public String toString() {
        return super.toString() + " đây là cá";
    }
}
