package com.company;

import java.util.Arrays;

public class Catalogue {
    private int itemCount;
    private String[] itemList;
    private Item[] objectList;

    public Catalogue(int itemCount) {
        this.itemCount = itemCount;
        this.itemList = new String[itemCount];
        this.objectList = new Item[itemCount];
    }

    public void addItem(Item object) {
        //Part1
        for (int i = 0; itemCount >= i; i++) {
            if (objectList[i] == null) {
                objectList[i] = object;
                System.out.println("produktet tog pladsen: " + i + " i kataloget.");
                System.out.println(object);
                break;
            }


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
        }
    }

    public Item[] getFullList(){
            return objectList;
        }

        public Item[] getAvailableItems() {

    }

    //Getter
    public int getItemCount() {
        return itemCount;
    }


}
