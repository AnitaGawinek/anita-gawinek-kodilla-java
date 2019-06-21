package com.kodilla.Food2Door;

public class Product {
    private String productName;
    private double productPrice;
    private int availableQuantity;

    public Product(final String productName, final double productPrice, final int availableQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.availableQuantity = availableQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    @Override
    public String toString() {
        return "name: '" + productName + '\'' +
                ", price: " + productPrice +
                ", available quantity: " + availableQuantity;
    }
}
