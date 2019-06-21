package com.kodilla.Food2Door;

public class Provider {
    private String providerName;


    public Provider() {
        this.providerName = getProviderName() ;
    }

    public String getProviderName() {
        return providerName;
    }

    public void process(Order order) {
        System.out.println("The order has been accepted.\n" + order);
    }
}
