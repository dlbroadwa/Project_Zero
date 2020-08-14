package com.company.models;

import java.math.BigDecimal;

public class Item {
    private int itemID=0;
    private String itemName= "";
    private BigDecimal itemPrice=BigDecimal.valueOf(0);
    private int quantity= 0;

    public Item(){}

    public Item(int itemID, String itemName){
        this.itemID = itemID;
        this.itemName = itemName;
        }
    public Item(int itemID, String itemName,int quantity){
        this(itemID, itemName);
        this.quantity = quantity;
    }

    public Item(int itemID, String itemName,BigDecimal itemPrice, int quantity){
        this(itemID, itemName, quantity);
        this.itemPrice = itemPrice;

    }

    public int getItemID() {
        return itemID;
    }
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
