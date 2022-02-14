package com.company.services;

import com.company.model.Product;

import java.util.List;

public interface IProductService {
    void add(Product product);

    Product getById(int id);

    void removeByID(int removeId);

    void sortDESC();

    int getSize();

    void showProduct();

    void sortESC();

    List<Product> searchByName(CharSequence nameResearch);
}
