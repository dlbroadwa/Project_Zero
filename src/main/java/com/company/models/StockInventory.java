package com.company.models;

import java.util.ArrayList;
import java.util.Objects;

public class StockInventory {
    private Item item;
    private ArrayList<Item> currentItems = new ArrayList<>();

    public StockInventory(){}
    public StockInventory(Item item){
        this.currentItems.add(item);
    }
    public StockInventory(ArrayList<Item> list){
        this.currentItems = new ArrayList<>(list);
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
        this.currentItems.add(item);
    }

    public ArrayList<Item> getCurrentItems() {
        return currentItems;
    }

    public void setCurrentItems(ArrayList<Item> currentItems) {
        this.currentItems = currentItems;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StockInventory)) return false;
        StockInventory that = (StockInventory) o;
        return Objects.equals(item, that.item) &&
                Objects.equals(currentItems, that.currentItems);
    }

    public int hashCode() {
        return Objects.hash(item, currentItems);
    }


    public String toString() {
        return "StockInventory{" +
                "item=" + item +
                ", currentItems=" + currentItems +
                '}';
    }
}

