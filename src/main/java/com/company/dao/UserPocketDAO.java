package com.company.dao;

import com.company.connections.MyConnection;
import com.company.connections.MyPostgresConnection;

import java.util.List;

public class UserPocketDAO implements DAO {
    private MyPostgresConnection connect;

    public UserPocketDAO(MyConnection connect){
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
