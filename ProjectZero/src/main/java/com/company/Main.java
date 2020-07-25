package com.company;

import com.company.connections.MyPostgresConnection;
import org.postgresql.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    //The static block is used to preempt the data base connection
    static {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //database connection used to link to the AWS DB
        new MyPostgresConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres","enter123","inventoryapp");

    }
}
