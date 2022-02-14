package com.company.model;

public class Product {
    private short id;
    private String name;
    private int quantity;
    private double price;

    public Product() {
    }

    public Product(String name, int quantity, double price) {
        this.id = (short) (Math.abs((short) System.currentTimeMillis()) + (short) (Math.random() * (999 - 100 + 1) + 100));
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
