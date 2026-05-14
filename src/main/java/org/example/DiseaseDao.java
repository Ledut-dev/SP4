package org.example;

import java.sql.SQLException;
import java.util.List;

public class DiseaseDao implements Dao<Disease> {
    @Override
    public Disease get(int ID) throws SQLException {
        return null;
    }

    @Override
    public List<Disease> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public void save(Disease disease) throws SQLException {

    }

    @Override
    public int insert(Disease disease) throws SQLException {
        return 0;
    }

    @Override
    public int update(Disease disease) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Disease disease) {
        return 0;
    }
}
