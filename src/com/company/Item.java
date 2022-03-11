package com.company;

public class Item {

    private boolean available;
    private String description;
    private String category;
    private boolean setAvailable;

    public Item(String category, String description) {
        this.description = description;
        this.category = category;
        this.available = true;
        this.setAvailable = true;
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

    public void setAvailable(boolean b) {
        
    }
}
