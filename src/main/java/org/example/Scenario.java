package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Scenario {

    private int scenarioID;
    private ArrayList<Card> scenarioCards;
    private ArrayList<Card> pickedCards;
    private Random random = new Random();

    public Scenario(int scenarioID){
        this.scenarioID = scenarioID;
        this.scenarioCards = new ArrayList<>();
        this.pickedCards = new ArrayList<>();
    }

    public void addPickedCard(Card card){
        pickedCards.add(card);
    }

    public void addScenarioCard(Card card){
        scenarioCards.add(card);
    }

    //Will this pick at random? Are the options potentially weighted?
    //Currently coded to return a single random card from scenarioCards
    public Card getCardOption(){
        Card card = scenarioCards.get(random.nextInt(scenarioCards.size()+1));
        return card;
    }

}
