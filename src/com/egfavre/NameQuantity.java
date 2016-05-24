package com.egfavre;

/**
 * Created by user on 5/23/16.
 */
public class NameQuantity {
    String itemName;
    Integer quantity;
    String category;



    public NameQuantity(String itemName, Integer quantity, String category) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.category = category;
    }

    public NameQuantity() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
