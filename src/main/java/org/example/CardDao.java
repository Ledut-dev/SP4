package org.example;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CardDao implements Dao<Card>{

    @Override
    public Card get(int ID) throws SQLException {
        return null;
    }

    @Override
    public List<Card> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public void save(Card card) throws SQLException {

    }

    @Override
    public int insert(Card card) throws SQLException {
        return 0;
    }

    @Override
    public int update(Card card) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Card card) {
        return 0;
    }

    public List<Card> getAllByScenarioID(int ID) throws SQLException{

    }
}
