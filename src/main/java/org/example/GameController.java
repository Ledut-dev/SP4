package org.example;

import java.util.ArrayList;

public class GameController {

    private GameService gameService;

    public GameController(){
        this.gameService = new GameService();
    }

    public void createPlayer(){
        gameService.getGame().getTeam().addPlayer("test");
    }

    public ArrayList<String> endRound(){
        ArrayList<String> changedAttributesValues = gameService.calculateRoundEffects();
        gameService.getGame().incrementTurnCount();

        return changedAttributesValues;
    }

    public void cardPicked(int cardChoice){
        gameService.getGame().getCurrentScenario().addPickedCard(cardChoice);
    }

    public ArrayList<Card> getCardOptions(){
        return gameService.getGame().getCurrentScenario().getCurrentOptions();
    }

    public String getCurrentPlayerName(){
        return gameService.getGame().getTeam().getCurrentPlayer(gameService.getGame().getTurnCount()).getName();
    }

    //Having looked at the MVC model more, GameController in this instance is used for connection between the model
    //our Game, Player, Team etc, and our view.
    //Reading up about DAO (Data Access Objects) and DTO (Data Transfer Objects, like the classes Player/Disease/Card),
    //we might want to look at having a DAO interface for handling CRUD operations on our database.
    //The principles of Data Encapsulation and OOP programming to an Interface

    //A lot to look at regarding the implementation of the DAO model.
    //F.ex. whether to have a generic Dao interface, a UserDao interface -> UserDaoImpl class.
}
