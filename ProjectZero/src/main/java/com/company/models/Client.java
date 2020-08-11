package com.company.models;

import java.math.BigDecimal;

public class Client {
    private int storeID;
    private String storeName;
    private Inventory inventory;
    private User user;

    public int getStore_id() {
        return storeID;
    }

    public void setStore_id(int storeID) {
        this.storeID = storeID;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStore_name(String storeName) {
        this.storeName = storeName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
