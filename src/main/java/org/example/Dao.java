package org.example;

import java.sql.SQLException;
import java.util.List;

//Example of a generic DAO interface, with the normal CRUD commands like save, insert, update and delete.
//Have made a specific PlayerDAO to show implementation
public interface Dao<T> {

    T get(int ID) throws SQLException;

    List<T> getAll() throws  SQLException;

    void save(T t) throws SQLException;

    int insert(T t) throws SQLException;

    int update(T t) throws SQLException;

    int delete(T t);
}
