package com.kodilla.Food2Door;

public class HealthyShop extends Provider {
    private String providerName = "HealthyShop";

    public HealthyShop() {
        this.providerName = providerName;
    }

    @Override
    public String getProviderName() {
        return providerName;
    }
}
