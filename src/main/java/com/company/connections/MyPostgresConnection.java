package com.company.connections;

import com.company.models.Application;
import com.company.models.InventoryManagementApp;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyPostgresConnection extends MyConnection {
    //This static block is used to preempt the database connection
    static {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    // Connection class inherited from the abstract Connection class
    public MyPostgresConnection(String url, String username, String password, String schema) {
        //sets inherited variables for the new class
        this.url = url;
        this.username = username;
        this.password = password;
        this.schema = schema;

    }
    /*** Calls the inherited method to located and access the DB using Driver manager ***/
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    /**********************CONNECTS TO THE DATABASE AND CALLS THE APPLICATION **************************************/
    public String getDefaultSchema() {
        return this.schema;
    }

    //
//    public void testConnection(){
//        try {
//            // tests if database is connected
//            connection = getConnection();
//            if(connection != null) {
//
//                //call the application
//                Application app = new InventoryManagementApp(connection);
//                app.run();
//
//            } else {
//                System.out.println("Connection failed");
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        } finally {
//            // if connection worked close it
//            if(connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException throwables) {
//                    // this will only happen if the connection has already been closed
//                    throwables.printStackTrace();
//                }
//            }
//        }
//    }
}
