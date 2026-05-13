package org.example;

public class GameController {

    private Game game;
    private Menu menu;

    public GameController(Game game, Menu menu){
        this.game = game;
        this.menu = menu;
    }

    //Having looked at the MVC model more, GameController in this instance is used for connection between the model
    //our Game, Player, Team etc, and our view.
    //Reading up about DAO (Data Access Objects) and DTO (Data Transfer Objects, like the classes Player/Disease/Card),
    //we might want to look at having a DAO interface for handling CRUD operations on our database.
    //The principles of Data Encapsulation and OOP programming to an Interface

    //A lot to look at regarding the implementation of the DAO model.
    //F.ex. whether to have a generic Dao interface, a UserDao interface -> UserDaoImpl class.
}
