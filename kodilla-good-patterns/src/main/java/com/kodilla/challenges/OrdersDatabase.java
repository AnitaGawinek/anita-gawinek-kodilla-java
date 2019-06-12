package com.kodilla.challenges;

import java.time.LocalDateTime;

public class OrdersDatabase implements OrderRepository {
    public User user;
    public Product product;
    public LocalDateTime orderDate;

    public OrdersDatabase(User user, Product product, LocalDateTime orderDate) {
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
    }

    public void addOrder(){
        System.out.println("New order was added to database:\nUser: "
                + user.getFullName() + ",product: " + product.getName() + ",order date: " + orderDate);
    }
}
