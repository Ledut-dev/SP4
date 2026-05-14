package org.example;

public class Card {

    private int cardID;
    private int effectAmount;
    private String cardDescription;
    //Might need to have affectedValue be an Enum, to make sure an actual existing Disease attribute is always changed correctly.
    private String affectedValue;



    public Card(int cardID, int effectAmount, String affectedValue, String cardDescription){
        this.cardID = cardID;
        this.cardDescription = cardDescription;
        this.effectAmount = effectAmount;
        this.affectedValue = affectedValue;
    }

    public String getCardDescription(){
        return this.cardDescription;
    }

    public int getEffectAmount() {
        return this.effectAmount;
    }

    public String getAffectedValue() {
        return this.affectedValue;
    }

    public int getCardID() {
        return cardID;
    }
}
