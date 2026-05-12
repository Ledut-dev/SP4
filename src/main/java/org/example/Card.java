package org.example;

public class Card {

    private int cardID;
    private String cardDescription;

    public Card(int cardID, String cardDescription){
        this.cardID = cardID;
        this.cardDescription = cardDescription;
    }

    public String getCardDescription(){
        return this.cardDescription;
    }
}
