package com.kodilla.Food2Door;

import java.time.LocalDate;

public class Order {
    private int orderNumber;
    private int orderedQuantity;
    private LocalDate orderTime;
    private Product productInfo;
    private Provider provider;

    public Order(final int orderNumber, final Product productInfo, final int orderedQuantity, final Provider provider, final LocalDate orderTime) {
        this.orderNumber = orderNumber;
        this.orderedQuantity = orderedQuantity;
        this.orderTime = orderTime;
        this.productInfo = productInfo;
        this.provider = provider;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getOrderedQuantity() {
        return orderedQuantity;
    }

    public LocalDate getOrderTime() {
        return orderTime;
    }

    public Product getProductInfo() {
        return productInfo;
    }

    public Provider getProvider() {
        return provider;
    }

    @Override
    public String toString() {
        return "Order info: " +
                "order number: " + orderNumber +
                ", ordered quantity: " + orderedQuantity +
                ", order time: " + orderTime +
                ", product info: " + productInfo +
                ", provider: " + provider.getProviderName();
    }
}
