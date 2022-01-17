package com.AbstractAndInterface;

public class Main {
    public static void main(String[] args) {
        Animal chicken = new Chicken();
        Chicken chicken1 = (Chicken) chicken;
        System.out.println( ((Chicken) chicken).howToEat());
        Fruit apple = new Apple();
        apple.setColor("Red");
        System.out.println(apple);
    }
}
