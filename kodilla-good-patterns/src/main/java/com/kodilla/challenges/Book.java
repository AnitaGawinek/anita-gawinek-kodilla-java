package com.kodilla.challenges;

public class Book implements Product {
    private String name = "Book";
    private String author = "Ronald Shakespeare Mc'Donald";
    private String title = "Game of Shakes";

    private boolean available = false;
    public String getName() {
        return name + ": " + author + ", \"" + title + "\"";
    }
    public void setAvailable(boolean available){
        this.available = available;
    }
}
