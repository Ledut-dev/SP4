package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Scenario {

    private int scenarioID;
    private ArrayList<Card> scenarioCards;
    private ArrayList<Card> currentOptions;
    private ArrayList<Card> pickedCards;
    private Random random = new Random();

    public Scenario(int scenarioID){
        this.scenarioID = scenarioID;
        this.scenarioCards = new ArrayList<>();
        this.pickedCards = new ArrayList<>();
        this.currentOptions = new ArrayList<>();
    }

    public void addPickedCard(int cardChoice){
        //TODO - Make sure this aligns with return value from view/controller
        pickedCards.add(currentOptions.get(cardChoice-1));
    }

    public void setScenarioCards(ArrayList<Card> cards){
        this.scenarioCards = cards;
    }

    public void addCardAsOption(){
        currentOptions.add(getCardOption());
    }

    //Will this pick at random? Are the options potentially weighted?
    //Currently coded to return a single random card from scenarioCards
    public Card getCardOption(){
        return scenarioCards.get(random.nextInt(scenarioCards.size()+1));
    }

    public ArrayList<Card> getCurrentOptions(){
        return this.currentOptions;
    }

    public int getScenarioID() {
        return this.scenarioID;
    }

    public ArrayList<Card> getPickedCards(){

        return this.pickedCards;
    }
}
