package com.Nemo;

public class Bird extends Animals implements Flyable{
    public Bird(String color, String name) {
        super(color, name);
    }

    @Override
    public String toString() {
        return super.toString() + " đây là chim";
    }

    @Override
    public void howToFly() {
        System.out.println("Bay bằng cánh, dựa vào lực nâng của không khí");
    }
}
