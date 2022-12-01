package com.company.connections;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class MyConnection {
    //abstract class may or may not include abstract methods. Abstract classes cannot be instantiated,
    //but they can be subclassed. General abstract class for databases
    protected String url;
    protected String username;
    protected String password;
    protected String schema ;
    //
    public abstract Connection getConnection() throws SQLException;
    //Connection  defines how a client may access a database.
    //SQLException is an exception that provides information on a database access error or other errors.

}
