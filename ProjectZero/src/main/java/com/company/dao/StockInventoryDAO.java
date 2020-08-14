package com.company.dao;

import com.company.connections.MyConnection;
import com.company.connections.MyPostgresConnection;
import com.company.models.Item;
import com.sun.deploy.ui.DialogTemplate;

import java.util.List;

public class StockInventoryDAO implements DAO<Integer, Item>{
    private MyPostgresConnection connect;

    public StockInventoryDAO(MyConnection connect){
        if(connect != null){
            this.connect = (MyPostgresConnection) connect;
        }
    }
    @Override
    public boolean update(Item item) {
        return false;
    }

    @Override
    public boolean save(Item item) {
        return false;
    }

    @Override
    public boolean delete(Item item) {
        return false;
    }

    @Override
    public List retrieveAll() {
        return null;
    }

    @Override
    public Item retrieveByID(Integer id) {
        return null;
    }
}
