package org.example;

import processing.core.PApplet;

public class ScreenOne extends Scene{

    String scenarioTitle       = "Scenario Title";
    String scenarioDescription = "Scenario description goes here.";
    String card1               = "Option 1";
    String card2               = "Option 2";
    String card3               = "Option 3";

    @Override
    public void enter(PApplet p){
        super.enter(p);
    }


    @Override
    public int render(PApplet p) {
        p.background(color.prussianBlue);
        //p.drawBackButton();
        p.textAlign(p.width/2, p.height/2);
        p.textSize(32);
        p.fill(color.apricotCream);
        p.text(scenarioTitle, (float)p.width/2, 80);
        p.textSize(15);
        p.fill(color.champagneMist);
        p.text(scenarioDescription, (float)p.width/2, 140);
        p.fill(color.electricIndigo);
        p.rect((float)p.width/2 - 150, 220, 300, 60, 10);
        p.fill(color.champagneMist);
        p.textSize(16);
        p.text(card1, (float)p.width/2, 258);
        p.fill(color.electricIndigo);
        p.rect((float)p.width/2 - 150, 310, 300, 60, 10);
        p.fill(color.champagneMist);
        p.text(card2, (float)p.width/2, 348);
        p.fill(color.electricIndigo);
        p.rect((float)p.width/2 - 150, 400, 300, 60, 10);
        p.fill(color.champagneMist);
        p.text(card3, (float)p.width/2, 438);

        return 0;
    }

    public void handleClick() {

    }
}
