package com.kodilla.Food2Door;

public class GlutenFreeShop extends Provider {
    private String providerName = "GlutenFreeShop";

    public GlutenFreeShop() {
        this.providerName = providerName;
    }

    @Override
    public String getProviderName() {
        return providerName;
    }
}
