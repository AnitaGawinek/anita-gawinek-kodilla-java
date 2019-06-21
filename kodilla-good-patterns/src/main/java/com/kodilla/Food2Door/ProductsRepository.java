package com.kodilla.Food2Door;

import java.util.ArrayList;

public class ProductsRepository {
    private ArrayList<Product> products = new ArrayList<>();

    public ProductsRepository() {
    }

    public Product getProductInfo(int index) {
        products.add(new Product("Fruit 1", 3.99, 100));
        products.add(new Product("Fruit 2", 2.99, 150));
        products.add(new Product("Vegetable 1", 0.99, 200));
        products.add(new Product("Vegetable 2", 1.59, 200));
        products.add(new Product("Honey 1", 19.99, 20));
        products.add(new Product("Honey 2", 14.99, 20));
        products.add(new Product("Milk 1", 5.99, 30));
        products.add(new Product("Milk 2", 4.99, 40));
        products.add(new Product("Bread 1", 4.99, 30));
        products.add(new Product("Bread 2", 6.99, 50));
        products.add(new Product("Roll 1", 1.59, 100));
        products.add(new Product("Roll 2", 1.19, 150));
        return products.get(index);
    }
}
