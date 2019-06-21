package com.kodilla.Food2Door;

import java.time.LocalDate;

public class Food2DoorApp {

    public static void main(String[] args){

        Provider provider = new HealthyShop();
        ProductsRepository repository = new ProductsRepository();

        Order order1 = new Order(1, repository.getProductInfo(7), 10, provider,
                (LocalDate.of(2019, 06, 10)));
        provider.process(order1);
    }
}
