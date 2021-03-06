package com.egfavre;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes;

public class Main {

    public static void main(String[] args) {
        //Make a dynamic list of item name:quantity
        //be able to add, etc

        //define arrayList
        ArrayList<NameQuantity> inventory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        NameQuantity item = new NameQuantity("Jerseys", 12, "Jersey");
        inventory.add(item);

        while(true) {
                System.out.println("Current Inventory:");
                System.out.printf("Item  Name       Qty   Cat     \n");
                int i = 1;
                for (NameQuantity temp : inventory) {
                    System.out.printf("%s     %s    %s    %s\n", i, temp.itemName, temp.quantity, temp.category);
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
    public static void createItem (Scanner scanner, ArrayList<NameQuantity> inventory) {
        System.out.println("What is the name of the new item?");
        Scanner newScanner = new Scanner(System.in);
        String newItemName = newScanner.nextLine();
        System.out.println("What is the quantity?");
        Integer newQuantity = scanner.nextInt();
        NameQuantity newObject = factoryItem(newItemName, newQuantity);
        inventory.add(newObject);
    }
    public static NameQuantity factoryItem(String newItemName, Integer newQuantity){
        System.out.printf("What category is the new item? \n 1. Jersey\n 2. Shoe\n 3. Ball\n 4. ShinGuard\n 5. WaterBottle\n");
        Scanner scanner = new Scanner(System.in);
        Integer categoryChoice = scanner.nextInt();
        switch (categoryChoice) {
                case 1:
                    return new Jersey(newItemName, newQuantity);
                case 2:
                    return new Shoe(newItemName, newQuantity);
                case 3:
                    return new Ball(newItemName, newQuantity);
                case 4:
                    return new ShinGuard(newItemName, newQuantity);
                case 5:
                    return new WaterBottle(newItemName, newQuantity);
            }
            return null;
    }

 }

