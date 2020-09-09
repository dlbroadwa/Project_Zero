package com.company.dao;

import com.company.connections.MyConnection;
import com.company.connections.MyPostgresConnection;
import com.company.models.User;

import java.util.List;

public class UserDAO implements DAO {
    private MyPostgresConnection connect;

    public UserDAO(MyConnection connect){
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
    public User retrieveByID(Object o) {
        return null;
    }
}
