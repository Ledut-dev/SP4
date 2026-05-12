package org.example;

public class Game {

    private int turnCounter;
    private Disease disease;
    private Team team;
    private Difficulty difficulty;

    public Game(Disease disease, Team team, Difficulty difficulty){
        this.turnCounter = 0;
        this.disease = disease;
        //Might wanna have the team instance created here in Game, instead of passed in constructor.
        this.team = team;
        this.difficulty = difficulty;
    }

}
