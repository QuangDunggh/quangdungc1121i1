package com.ClassAndOOps;

public class Animals {
    private int age;
    private String name;
    private double weight;
    private double height;
    private String leg;

    public Animals() {
    }

    public Animals(int age, String name, double weight, double height, String leg) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.leg = leg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String move(String describe) {
        return "Đây là động vật đi bằng " + describe;
    }

    public String eat(String describe) {
        return "Đây là động vật ăn " + describe;
    }

    public String say(String describe) {
        return "Giọng nói của " + this.name + " là " + describe;
    }

    @Override
    public String toString() {
        return " Lớp Animals " + " " + move(this.leg);
    }

    public static void main(String[] args) {
        Animals dog = new Animals(10, "dog", 20.0, 0.6,"4 chân");
        System.out.println(dog);
    }
}
