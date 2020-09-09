package com.company.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.Objects;

public class StoreInventory {
    private Connection connection;
    private int storeID = 0;
    private Item item;
    private ArrayList<Item> currentItems;

    public StoreInventory(){ }

    public StoreInventory(int storeID){
        this.storeID = storeID;
    }

    public StoreInventory(int storeID,Item item){
        this.currentItems.add(item);
    }

    public StoreInventory(int storeID, ArrayList<Item> list){
        this(storeID);
        this.currentItems = new ArrayList<>(list);
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ArrayList<Item> getCurrentItems() {
        return currentItems;
    }

    public void setCurrentItems(ArrayList<Item> currentItems) {
        this.currentItems = currentItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StoreInventory)) return false;
        StoreInventory that = (StoreInventory) o;
        return storeID == that.storeID &&
                currentItems.equals(that.currentItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeID, currentItems);
    }

    @Override
    public String toString() {
        return "StoreInventory{" +
                "connection=" + connection +
                ", storeID=" + storeID +
                ", item=" + item +
                ", currentItems=" + currentItems +
                '}';
    }
}












/*public void populateInventory(){
        Item x;
        String name;
        current_items = new ArrayList<>();
        ArrayList<BigDecimal> prices= new ArrayList<>();
        int quantity;
        int item_id;
        BigDecimal balance =BigDecimal.valueOf(0);

        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from inventoryapp.pockets");

            while (rs.next()) {
                balance=rs.getBigDecimal(2);
            }
            setCurrent_cash(balance);

            rs = statement.executeQuery("select * from inventoryapp.store_inventory");
            while (rs.next()) {
                prices.add(rs.getBigDecimal(3));
            }

            ResultSet resultSet = statement.executeQuery("select * from " +
                    "inventoryapp.stock_inventory");
            int id = 0;
            while (resultSet.next()) {
                x= new Item();

                //Read from Database table then assign as variables
                item_id=resultSet.getInt(1);
                name= resultSet.getString(2);
                quantity = resultSet.getInt(3);

                //assign local variables to object variables
                x.setItem_id(item_id);
                x.setItem_name(name);
                x.setQuantity(quantity);
                x.setItem_price(prices.get(id));
                current_items.add(id,x);
                id++;
            }
            setCurrent_items(current_items);

        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
*/
