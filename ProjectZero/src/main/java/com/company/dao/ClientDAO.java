package com.company.dao;

import com.company.connections.MyConnection;
import com.company.connections.MyPostgresConnection;
import com.company.models.Client;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.List;

public class ClientDAO implements DAO<Client, Integer>{
    
    private MyPostgresConnection connect;

    public ClientDAO(MyConnection connect){
        if(connect != null){
            this.connect = (MyPostgresConnection) connect;
        }
    }
    @Override
    public boolean update(Client obj) {
        String updateStatement = ("UPDATE " + connect.getDefaultSchema() + ".client_list SET store_id = ?, store_name = ? " +
                "WHERE store_id = ?");
        try (Connection connection = connect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(updateStatement)){

            preparedStatement.setInt(1,obj.getStoreID());
            preparedStatement.setString(2,obj.getStoreName());
            return preparedStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean save(Client obj) throws SQLException {
        String statement = "Insert into " + connect.getDefaultSchema() + "." + "client_list" +
                " (store_id, store_name) VALUES (?,?) returning store_id";
        try (Connection connection = connect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(statement)) {
            preparedStatement.setInt(1, obj.getStoreID());
            preparedStatement.setString(2, obj.getStoreName());

            try (ResultSet rs = preparedStatement.executeQuery()) {
                if (rs.next()) {
                    obj.setStoreID(rs.getInt(1));
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

        @Override
    public boolean delete(Client obj) {
        return false;
    }



    @Override
    public List retrieveAll() {
        return null;
    }

    @Override
    public Client retrieveByID(Integer ID) {
        Client client = null;
        String selectStatement = "SELECT * FROM " + connect.getDefaultSchema() + "." + "client_list"
                + " WHERE store_id = ?";
        try (Connection connection = connect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectStatement)){
            preparedStatement.setInt(1,ID);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    client = new Client();

                    client.setStoreID(resultSet.getInt("store_id"));
                    client.setStoreName(resultSet.getString("store_name"));

                } else
                    System.out.println("No Client by that id found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }
}
