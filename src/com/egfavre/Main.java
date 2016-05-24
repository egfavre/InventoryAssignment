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
                System.out.println("Current Inventory:");
                int i = 1;
                for (NameQuantity temp : inventory) {
                    System.out.printf("%s %s %s\n", i, temp.itemName, temp.quantity);
                    i++;
                }

                {
                    System.out.println("");
                    System.out.println("Menu:");
                    System.out.println("1. Create New Item");
                    System.out.println("2. Remove Existing Item");
                    System.out.println("3. Update Quantity of Existing Item");
                }

            Integer choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createItem(scanner, inventory);
                    break;
                case 2:
                    removeItem(scanner, inventory);
                    break;
                case 3:
                    update(scanner, inventory);
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }

    //create new Item
    public static void addItem(Scanner scanner, ArrayList<NameQuantity> inventory) {
        System.out.println("What is the name of the new item?");
        Scanner newScanner = new Scanner(System.in);
        String itemName = newScanner.nextLine();
        System.out.println("What is the quantity?");
        Integer qty = scanner.nextInt();
        System.out.printf("What category is the new item? \n 1. Jersey\n 2. Shoe\n 3. Ball\n 4. ShinGuard\n 5. WaterBottle\n");
        int categoryChoice = scanner.nextInt();



        System.out.println("What is the name of the new item?");
        Scanner newScanner = new Scanner(System.in);
        String tempName = newScanner.nextLine();
        System.out.println("What is the quantity?");
        Integer qty = scanner.nextInt();
        NameQuantity item = new NameQuantity(tempName, qty);
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
        inventory.get(itemNum - 1).quantity = newQty;


    }

    //factory method
    public static NameQuantity createItem (int categoryChoice, String itemName, Integer quantity, String category){
            switch (categoryChoice) {
                case 1:
                    return new Jersey(itemName, quantity, category);
                case 2:
                    return new Shoe(itemName, quantity, category);
                case 3:
                    return new Ball(itemName, quantity, category);
                case 4:
                    return new ShinGuard(itemName, quantity, category);
                case 5:
                    return new WaterBottle(itemName, quantity, category);
            }
            return null;
    }

 }

