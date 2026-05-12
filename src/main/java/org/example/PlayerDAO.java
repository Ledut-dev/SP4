package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO implements DAO<Player>{

    //Can have the implemented DAO store player objects, as a way of having an "in-memory" databasde
    private ArrayList<Player> players = new ArrayList<>();

    @Override
    public Player get(int ID) throws SQLException {

        Connection con = DBConnector.getConnection();

        Player player = null;

        //Can create the SQL statement either as a string, or directly from prepareStatement method.
        //String sql = "SELECT id, name, role FROM Players WHERE id = ?";
        PreparedStatement statement = con.prepareStatement("SELECT id, name, role FROM Players WHERE id = ?");

        //Replaces variable with id 1 (first ? in statement) with the ID we pass to this function.
        statement.setInt(1, ID);

        //Actually executing the SQL query and saving as ResultSet
        ResultSet rs = statement.executeQuery();

        //Check if returned value is null, else parse data to variables and create the "correct" Player object.
        //rs.next() returns true if there is actual data on next line, else returns false if at the end of the ResultSet
        if (rs.next()){
            //playerID is technically not needed, as it's mostly used as the primary key for the database.
            //Although we could have it as a field in the Player class, if we want to use it at any point.
            int playerID = rs.getInt("id");
            String name = rs.getString("name");

            //Getting and setting a players role needs to be discussed. We need a linking table in our database, to link role/roleID for a player
            //to an actual role from the Role table in the database.

            player = new Player(name, role);
        }

        return player;
    }

    @Override
    public List<Player> getAll() throws SQLException {
        return list;
    }

    @Override
    public void save(Player player){
        players.add(player);
    }

    @Override
    public int insert(Player player) throws SQLException {
        return 0;
    }

    @Override
    public int update(Player player) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Player player) {
        return 0;
    }
}
