package org.example;

import java.sql.SQLException;
import java.util.List;

public class RoleDao implements Dao<Role>{
    @Override
    public Role get(int ID) throws SQLException {
        return null;
    }

    @Override
    public List<Role> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public void save(Role role) throws SQLException {

    }

    @Override
    public int insert(Role role) throws SQLException {
        return 0;
    }

    @Override
    public int update(Role role) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Role role) {
        return 0;
    }
}
