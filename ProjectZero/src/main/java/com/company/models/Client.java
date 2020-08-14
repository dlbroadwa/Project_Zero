package com.company.models;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Client {
    private int storeID;
    private StoreInventory storeInventory;
    private StockInventory stockInventory;
    private String storeName;
    private User user;
    private ArrayList<User> authorizedUserList= new ArrayList<>();
    public Client(){ }
    public Client(int storeID,String storeName, User user){
        this.storeID = storeID;
        this.storeName = storeName;
        this.user = user;
        this.authorizedUserList.add(getUser());
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }
    public StoreInventory getInventory() {
        return storeInventory;
    }

    public void setInventory(StoreInventory inventory) {
        this.storeInventory = inventory;
    }
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<User> getAuthorizedUserList() {
        return authorizedUserList;
    }

    public void setAuthorizedUserList(ArrayList<User> authorizedUserList) {
        this.authorizedUserList = authorizedUserList;
    }

}
