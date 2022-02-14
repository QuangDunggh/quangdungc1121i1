package com.company.services;

import com.company.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductService implements IProductService {
    private List<Product> products;

    public ProductService() {
        products = new ArrayList<>();
        Product product1 = new Product("Dung", 123, 1234);
        Product product2 = new Product("Truong", 123, 1234);
        Product product3 = new Product("Tung", 123, 1234);
        Product product4 = new Product("Phuong", 123, 1234);
        Product product5 = new Product("Duong", 123, 1234);
        Product product6 = new Product("Cu", 123, 1234);
        Product product7 = new Product("BLablo", 123, 1234);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public Product getById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public void removeByID(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(products.get(i));
                return;
            }
        }

    }

    //    public void searchByName(String nameSearch) {
//        char[] name1 = nameSearch.toCharArray();
//        List<Product> searchResult = new ArrayList<>();
//        for (int i = 0; i < products.size(); i++) {
//            char[] booksName = products.get(i).getName().toCharArray();
//            for (int j = 0; j < name1.length; j++) {
//                if (name1[j] == booksName[j]) {
//                    searchResult.add(products.get(i));
//                }
//            }
//        }
//        for (int i = 0; i < searchResult.size(); i++) {
//            System.out.println(searchResult.get(i));
//        }
//    }
    @Override
    public List<Product> searchByName(CharSequence nameSearch) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(nameSearch))
                result.add(product);
        }
        return result;
    }

    @Override
    public int getSize() {
        return products.size();
    }

    public void showProduct() {
        for (Product book : products) {
            System.out.println(book);
        }
    }

    public int compare(Product o1, Product o2) {
        long result = o2.getId() - o1.getId();
        if (result > 0) {
            return 1;
        } else if (result == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public void sortDESC() {
        for (int i = 0; i < products.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < products.size(); j++) {
                int result = compare(products.get(min), products.get(j));
                if (result > 0) {
                    min = j;
                }
            }
            if (min != i) {
                Product temp = products.get(i);
                products.set(i, products.get(min));
                products.set(min, temp);

            }
        }
    }

    @Override
    public void sortESC() {
        for (int i = 0; i < products.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < products.size(); j++) {
                int result = compare(products.get(min), products.get(j));
                if (result < 0) {
                    min = j;
                }
            }
            if (min != i) {
                Product temp = products.get(i);
                products.set(i, products.get(min));
                products.set(min, temp);

            }
        }
    }
}


