package org.example;


public class Main {

    public static void main(String[] args){
        DBConnector db = new DBConnector();
        db.connect("jdbc:sqlite:data/diseases.sqlite");
        Disease disease = db.getRandomDisease();
    }

}
