package org.example;

import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players;
    private int highscore;

    public Team(String name){
        this.name = name;
        this.players = new ArrayList<>();
        //If loading a game, needs to be updated to take a highscore value from the database.
        this.highscore = 0;
    }

    public void addPlayer(String playerName, Role role) {
        players.add(createPlayer(playerName, role));
    }

    private Player createPlayer(String playerName, Role role){
        return new Player(playerName, role);
    }

    //Returns the player who is taking their turn, based on turnCount and size of team.
    //Instead of passing the turnCount int to this function, maybe need to do game.getTurnCount instead? Would need to look at the composition.
    //Potentially have the turnCount be a static/global variable? Passing the turnCounter int might be the best option
    public Player getCurrentPlayer(int turnCount){
        //Turncount-1 to account for index starting at 0
        return players.get((turnCount-1) % players.size());
    }

}
