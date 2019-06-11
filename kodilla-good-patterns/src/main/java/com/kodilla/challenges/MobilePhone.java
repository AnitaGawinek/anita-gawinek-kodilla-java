package com.kodilla.challenges;

public class MobilePhone implements Product {
    private String name = "Mobile Phone ";
    private boolean available = false;
    public String getName() {
        return name;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }
}
