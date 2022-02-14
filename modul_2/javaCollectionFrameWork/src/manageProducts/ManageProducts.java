package manageProducts;

import java.util.ArrayList;
import java.util.List;

public class ManageProducts <E> {
    private List<Products> arrayList;

    public ManageProducts(List<Products> arrayList) {
        arrayList = new ArrayList<>();
    }

    public ManageProducts() {}

    public void addProduct(Products product) {
        arrayList.add(product);
    }

    public Products findById(int id) {
        for (Products product: arrayList) {
            if(product.getId() == id) {
                return product;
            }

        } return null;
    }

    public boolean isEmpty() {
        if(arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public List<Products> findProductByName(String name) {
        List<Products> productsNeedFind = new ArrayList<>();
        for (Products products : arrayList) {
            if (products.getName().contains(name)) {
                productsNeedFind.add(products);
            }
        }
        return productsNeedFind;
    }

    public boolean isCheckId(int id) {
        for (Products products: arrayList) {
            if (products.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
