package org.example;

import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players;

    //Highscore potentially needs to be set in constructor, in the scenario we're loading an unfinished game.
    private int highscore = 0;

    public Team(String name){
        this.name = name;
        this.players = new ArrayList<>();
    }

    //Setter, will be used by game to add players to team
    public void addPlayerToTeam(Player player){
        players.add(player);
    }

    //Returns the player who is taking their turn, based on turnCount and size of team.
    public Player getCurrentPlayer(int turnCount){
        //Turncount-1 to account for index starting at 0
        Player player = players.get((turnCount-1) % players.size());
        return player;
    }

}
