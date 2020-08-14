package com.company.dao;

import com.company.connections.MyConnection;
import com.company.connections.MyPostgresConnection;

import java.sql.Connection;
import java.util.List;

public class StoreInventoryDAO implements DAO{
    private MyPostgresConnection connect;

    public StoreInventoryDAO(MyConnection connect){
        if(connect != null){
            this.connect = (MyPostgresConnection) connect;
        }
    }

    @Override
    public boolean update(Object obj) {
        return false;
    }

    @Override
    public boolean save(Object obj) {
        return false;
    }

    @Override
    public boolean delete(Object obj) {
        return false;
    }

    @Override
    public List retrieveAll() {
        return null;
    }

    @Override
    public Object retrieveByID(Object o) {
        return null;
    }
}
