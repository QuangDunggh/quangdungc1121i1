package com.ClassAndOOps;

public class Beer {
    public String name;
    private double price;
    public int quantity;
    private int id;
    public Beer() {

    }
    public Beer(String name, double price, int quantity, int id) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }
    public Beer(Beer beer) {
        this.name = beer.name;
        this.price = beer.price;
        this.quantity = beer.quantity;
        this.id = beer.id;
    }

    public Beer(double price, int id) {
        this.price = price;
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
