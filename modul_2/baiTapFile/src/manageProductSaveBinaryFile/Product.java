package manageProductSaveBinaryFile;

import java.io.Serializable;

public class Product implements Serializable {
    private int codeProduct;
    private String name;
    private String label;
    private double price;
    private String description;
    public Product() {}
    public Product(int codeProduct, String name, String label, double price, String description) {
        this.codeProduct = codeProduct;
        this.name = name;
        this.label = label;
        this.price = price;
        this.description = description;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct=" + codeProduct +
                ", name='" + name + '\'' +
                ", label='" + label + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
