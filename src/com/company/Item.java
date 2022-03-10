package com.company;

public class Item {

    private boolean available;
    private String description;
    private String category;

    public Item(String description, String category) {
        this.description = description;
        this.category = category;
        this.available = true;
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

    public String toString(){
        return category + " " + description;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
