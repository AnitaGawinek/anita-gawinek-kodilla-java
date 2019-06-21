package com.kodilla.Food2Door;

public class ExtraFoodShop extends Provider {
    private String providerName = "ExtraFoodShop";

    public ExtraFoodShop() {
        this.providerName = providerName;
    }

    @Override
    public String getProviderName() {
        return providerName;
    }
}
