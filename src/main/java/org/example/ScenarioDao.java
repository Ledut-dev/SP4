package org.example;

import java.sql.SQLException;
import java.util.List;

public class ScenarioDao implements Dao<Scenario>{
    @Override
    public Scenario get(int ID) throws SQLException {
        return null;
    }

    @Override
    public List<Scenario> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public void save(Scenario scenario) throws SQLException {

    }

    @Override
    public int insert(Scenario scenario) throws SQLException {
        return 0;
    }

    @Override
    public int update(Scenario scenario) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Scenario scenario) {
        return 0;
    }
}
