package com.egfavre;

/**
 * Created by user on 5/24/16.
 */
public class Shoe extends NameQuantity {
    public Shoe(String itemName, Integer quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.category = "Shoe";
    }
}
