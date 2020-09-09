package com.company.dao;

import com.company.connections.MyConnection;
import com.company.connections.MyPostgresConnection;
import com.company.models.Item;
//import com.sun.deploy.ui.DialogTemplate;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StoreInventoryDAO implements DAO<Item, Integer>{
    private MyPostgresConnection connect;

    public StoreInventoryDAO(MyConnection connect){
        if(connect != null){
            this.connect = (MyPostgresConnection) connect;
        }
    }

    public boolean update(Item item) {
        String updateStatement = "UPDATE " + connect.getDefaultSchema()
                + ".store_inventory SET item_name = ?, item_price = ?, store_id=?,item_description=?, item_quantity = ? where item_id = ?";
        try (Connection connection = connect.getConnection();
             PreparedStatement ps = connection.prepareStatement(updateStatement))
        {
            ps.setString(1, item.getItemName());
            ps.setBigDecimal(2, item.getItemPrice());
            ps.setInt(2, item.getStoreID());
            ps.setString(4, item.getItemDescription());
            ps.setInt(5, item.getQuantity());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }return false;
    }

    public boolean save(Item item) {
        String saveStatement = "INSERT INTO " + connect.getDefaultSchema() + "." + "store_inventory"
                + " (item_name, item_price, store_id, item_description, item quantity,) VALUES (?,?,?,?,?) returning item_id;";
        try (Connection connection = connect.getConnection();
             PreparedStatement ps = connection.prepareStatement(saveStatement)){

            ps.setString(1, item.getItemName());
            ps.setInt(2, item.getQuantity());
            ps.setBigDecimal(3, item.getItemPrice());

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    item.setItemID(rs.getInt(1));
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(Item item) {
        String statement = "DELETE FROM " + connect.getDefaultSchema() + "."
                + "store_inventory WHERE item_id = ?";
        try (Connection connection = connect.getConnection();
             PreparedStatement ps = connection.prepareStatement(statement)){
            ps.setInt(1,item.getItemID());
            ps.executeUpdate();
            return true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }


    public List retrieveAll() {
        String selectStatement = "SELECT * FROM " + connect.getDefaultSchema() + "." + "store_inventory";

        List<Item> itemList = new ArrayList<>();
        try (Connection connection = connect.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectStatement)){

            while (resultSet.next()) {
                itemList.add(new Item(resultSet.getInt("item_id"), resultSet.getString("item_name"), resultSet.getInt("item_quantity"), resultSet.getBigDecimal("item_price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return itemList;
    }

    public Item retrieveByID(Integer id) {
        String selectStatement = "SELECT * FROM " + connect.getDefaultSchema() + "." + "store_inventory"
                + " WHERE  item_id = ?";
        Item item = null;
        try (Connection connection = connect.getConnection();
             PreparedStatement ps = connection.prepareStatement(selectStatement)){
            ps.setInt(1, id);

            try (ResultSet resultSet = ps.executeQuery()) {
                if (resultSet.next()) {
                    item = new Item();

                    item.setItemID(resultSet.getInt("item_id"));
                    item.setItemName(resultSet.getString("item_name"));
                    item.setQuantity(resultSet.getInt("item_quantity"));
                    item.setItemPrice(resultSet.getBigDecimal("item_price"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }
}
