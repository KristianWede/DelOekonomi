package com.company;

import java.util.Scanner;

public class HovedMenu {

    public static void main(String[] args) {

        boolean valid = true;

        // Exercise Part 1: Create Catalogue and Item classes
        // Create a catalogue with size 10
        Catalogue catalogue = new Catalogue(10);

        //Create items and add to catalogue
        Item item1 = new Item("Sport", "Skateboard");
        catalogue.addItem(item1);
        Item item2 = new Item("Sport", "Mountainbike");
        catalogue.addItem(item2);
        Item item3 = new Item("Tøj", "Smoking");
        catalogue.addItem(item3);
        Item item4 = new Item("Tøj", "Pailletkjole");
        catalogue.addItem(item4);
        ///////////////////////////////////////////////

        do {
            // Exercise Part 2: Make program with user input instead of hardcoded values
            // Make program able to show menu and handles user choices in loop
            // Ask user what user wants to do
            System.out.println("Hvad kunne du tænke dig?");
            System.out.println("1. Se hele kataloget");
            System.out.println("2. Se hvad der er ledigt");
            System.out.println("3. Opret ting til udlån");
            System.out.println("4. Lån ting");
            System.out.println("5. Aflever ting");

            // Read user choice
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            // Decide what to do based on user choice
            if (choice == 1) { // get all items in cataloque
                Item[] allItems = catalogue.getFullList();
                for (int i = 0; i < allItems.length; i++) {
                    if ( allItems[i] == null){
                        System.out.println("Pladsen er tom.");
                    } else {
                        System.out.println(allItems[i]);
                    }
                }

            } else if (choice == 2) { // get available items in cataloque
                Item[] availableItems = catalogue.getAvailableItems();
                for (int i = 0; i < availableItems.length; i++) {
                    System.out.println(availableItems[i]);
                }

            } else if (choice == 3) { // Add new Item to catalogue
                // Hardcoded values for new Item
                System.out.println("Hvad skal du tilføje?");
                System.out.print("Indtast kategori: ");
                String addingCat = scanner.next();
                System.out.print("Indtast beskrivelse: ");
                String addingDesc = scanner.next();
                catalogue.addItem(new Item(addingCat,addingDesc));
                System.out.println("Objekt: " +addingDesc + " " + addingCat + " tilføjet til " + catalogue.getCount());

            } else if (choice == 4) { // make item unavailable
                // Hardcoded search criteria Skateboard
                System.out.println("Hvad skal du finde?");
                System.out.print("Indtast søgeord: ");
                String searchingWord = scanner.next();
                Item found = catalogue.findItem(searchingWord);
                catalogue.borrowItem(found);
                System.out.println("Nu er " + found + " er blevet lånt ud.");
            } else if (choice == 5) { // make item available again
                // Hardcoded search criteria Skateboard
                Item found = catalogue.findItem("Skateboard");
                catalogue.returnItem(found);
            } else { // invalid choice
                System.out.println("Du foretog et ugyldigt valg.");
            }
        } while(valid);
    }
}