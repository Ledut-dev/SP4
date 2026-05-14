package org.example;

public class Game {

    protected int turnCount;
    private Disease disease;
    private Team team;
    private Scenario currentScenario;

    public Game(String teamName, Disease enemy){
        this.turnCount = 0;
        this.disease = enemy;
        //Might wanna have the team instance created here in Game, instead of passed in constructor.
        this.team = new Team(teamName);

    }

    public Team getTeam(){
        return this.team;
    }

    public int getTurnCount(){
        return this.turnCount;
    }

    public void setCurrentScenario(Scenario scenario){
        this.currentScenario = scenario;
    }

    public void incrementTurnCount(){
        this.turnCount += 1;
    }

    public Scenario getCurrentScenario(){
        return this.currentScenario;
    }

    public Disease getDisease(){
        return this.disease;
    }

}
