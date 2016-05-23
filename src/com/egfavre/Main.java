package com.egfavre;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Make a dynamic list of item name:quantity
        //be able to add, etc

        //define arrayList
        ArrayList<NameQuantity> inventory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        NameQuantity item = new NameQuantity("Jerseys", 12);
        inventory.add(item);

        while(true) {
            int i = 1;
            for (NameQuantity temp : inventory) {
                System.out.println("Current Inventory:");
                System.out.println("");
                System.out.println(i + temp.itemName + " " + temp.quantity);
                System.out.println("");
                i++;
            }

            System.out.println("Menu:");
            System.out.println("1. Create New Item");
            System.out.println("2. Remove Existing Item");
            System.out.println("3. Update Quantity of Existing Item");

            Integer choice = scanner.nextInt();

            switch (choice) {
                case 1: createItem(scanner, inventory);
                    break;
                case 2: removeItem(scanner, inventory);
                    break;
                case 3:update(scanner, inventory);
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }
            //create new Item

    }
    public static void createItem(Scanner scanner, ArrayList<NameQuantity> inventory) {
        System.out.println("Enter your to do item:");
        String text = scanner.nextLine();
        System.out.println("What is the quantity?");
        Integer qty = scanner.nextInt();
        NameQuantity item = new NameQuantity(text, qty);
        inventory.add(item);
    }

    //remove an item
    public static void removeItem(Scanner scanner, ArrayList<NameQuantity> inventory) {
        System.out.println("Which Item would you like to remove?");
        Integer itemNum = scanner.nextInt();
        inventory.remove(itemNum - 1);
    }

    //update qty
    public static void update(Scanner scanner, ArrayList<NameQuantity> inventory) {
        System.out.println("For which item would you like to update the quantity?");
        Integer itemNum = scanner.nextInt();
        System.out.println("What is the new quantity?");
        Integer newQty = scanner.nextInt();
        NameQuantity temp = inventory.get(itemNum - 1);
        String tempName = temp.getItemName();
        Integer tempQty = temp.getQuantity();
        inventory.remove(itemNum - 1);
        NameQuantity temp2 = new NameQuantity(tempName, tempQty);
        inventory.add(temp2);
    }
 }

