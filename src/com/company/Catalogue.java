package com.company;

import java.util.Arrays;

public class Catalogue {
    private int itemCount;
    //private String[] itemList;
    private Item[] objectList;

    public Catalogue(int itemCount) {
        this.itemCount = itemCount;
        //this.itemList = new String[itemCount];
        this.objectList = new Item[itemCount];
    }

    public void addItem(Item object) {
        //Part1 Går igennem alle pladser på arrayet og tjekker om det er null.
        //Bagefter erstatter dem pladsen med et objekt.
        for (int i = 0; itemCount >= i; i++) {
            if (objectList[i] == null) {
                objectList[i] = object;
                System.out.println("produktet tog pladsen: " + i + " i kataloget.");
                System.out.println(object);
                break;
            }

/*
            //Part2
            //Kan bruge object til selve navnet for objektet, så den kan refereres til den hele tiden. (Fleksibel)
            //En smule kontanering
            String stringedDesc = object.getDescription();
            String stringedCat = object.getCategory();
            String stringedItem = stringedDesc + " " + stringedCat;
            //Et for loop som kører gennem hele arrayet til den finder en tom plads som den erstatter med det nye objekt.
            for (i = 0; itemCount >= i; i++) {
                if (itemList[i] == null) {
                    itemList[i] = stringedItem;
                    System.out.println("produktet tog pladsen: " + i + " i kataloget.");
                    System.out.println(stringedItem);
                    break;
                }
            }
 */
        }
    }

    public Item[] getFullList(){
            return objectList;
        }

        public Item[] getAvailableItems() {
        int objectsArraySize = 0;
            for (int i = 0; (itemCount) >= i; i++) {
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
            if(objectList[i].toString().equals(searchword)){
                System.out.println(objectList[i]);
                return ;
            }
        }
        return null;
    }

    //Getter
    public int getItemCount() {
        return itemCount;
    }
}
