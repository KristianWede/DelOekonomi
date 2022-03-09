package com.company;

public class Item {

    private boolean available = true;
    private String description;
    private String category;

    public Item(String description, String category) {
        this.description = description;
        this.category = category;
    }

    //Getter
    public boolean isAvailable() {
        return available;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }
}