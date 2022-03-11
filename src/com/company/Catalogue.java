package com.company;

import java.util.Arrays;

public class Catalogue {
    private int itemCount;
    private int productCount;
    private Item[] objectList;

    public Catalogue(int itemCount) {
        this.itemCount = itemCount;
        this.objectList = new Item[itemCount];
    }

    public void addItem(Item object) {
        objectList[productCount] = object;
        productCount++;
    }

    public Item[] getFullList(){
            return objectList;
        }

        public Item[] getAvailableItems() {
        int objectsArraySize = 0;
            for (int i = 0; (itemCount-1) >= i; i++) {
                if (objectList[i] != null) {
                    ++objectsArraySize;
                }
            }
            Item[] availableObjects = new Item[objectsArraySize];
            for (int i = 0; i < objectsArraySize; i++) {
                if (objectList[i] != null) {
                    availableObjects[i] = objectList[i];
                }
            }
            return availableObjects;
        }

    public Item findItem(String searchword){
        for (int i = 0; i < objectList.length; i++) {
            if(objectList[i] != null && objectList[i].getCategory().equals(searchword)){
                return objectList[i];
            }
        }
        return null;
    }

    public void borrowItem(Item object){
            object.setAvailable(false);
        System.out.println("Produktet: " + object + " er lånt.");
    }

    public void returnItem(Item object){
        object.setAvailable(true);
        System.out.println("Produktet: " + object + " er returneret.");
    }

    //Getter
    public int getCount() {
        return itemCount;
    }
}
