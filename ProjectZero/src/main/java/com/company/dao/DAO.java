package com.company.dao;

import java.util.List;

public interface DAO<Q,ID> {
    boolean update(Q obj);
    boolean save(Q obj);
    boolean delete(Q obj);
    List<Q> retrieveAll();
    Q retrieveByID(ID id);


}
