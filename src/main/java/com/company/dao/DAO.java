package com.company.dao;

import java.sql.SQLException;
import java.util.List;

public interface DAO<Q, ID> {
    boolean update(Q obj)throws SQLException;
    boolean save(Q obj) throws SQLException;
    boolean delete(Q obj)throws SQLException;
    List<Q> retrieveAll()throws SQLException;
    Q retrieveByID(ID id)throws SQLException;


}
