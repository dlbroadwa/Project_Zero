package com.company;

import com.company.connections.MyPostgresConnection;
//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.postgresql.Driver;
import org.w3c.dom.ls.LSOutput;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // print text to screen on app start
        System.out.println("Hello this is my inventory app");

        // print output for webapp
        //System.out.println("<p> You have reached my Inventory APP</p>");

        //database connection used to link to the app-code to the Database.
        new MyPostgresConnection(

                "jdbc:postgresql://localhost:5432/postgres",
                "postgres","enter123","inventoryapp"
                //Use the connection class variables to connect to DB application.
        );

    }
}
