package org.example;

import processing.core.PApplet;
import processing.core.PImage;

public class ScreenOne extends Scene{

    String scenarioTitle       = "Scenario Title";
    String scenarioDescription = "Scenario description goes here.";
    String card1               = "Option 1";
    String card2               = "Option 2";
    String card3               = "Option 3";

    String card11               = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,";
    String card22               = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,";
    String card33               = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,";

    String card111               = "Click here";


    PImage i;
    PImage a;
    double counter;


    @Override
    public void enter(PApplet p){
        super.enter(p);

        counter = 0.0;

        i = p.loadImage("doc/sick_city_futuristic_v2.png");
        p.image(i, 0,0);

        a = p.loadImage("doc/sick_city_card_template.png");
        //gennemsigtig baggrund
        p.fill(color.prussianBlue, 200);
        p.noStroke();
        p.rect(0,0, p.width, p.height);

    }


    @Override
    public int render(PApplet p) {

        p.textSize(40);
        p.fill(color.apricotCream);
        p.text(scenarioTitle, (float)p.width/2-100, 80);

        p.textSize(20);
        p.fill(color.champagneMist);
        p.text(scenarioDescription, (float)p.width/2-100, 140);


        p.image(a, (float)p.width/4 - 150, 160, 300, 450);
        p.image(a, (float)p.width/2 - 150, 160, 300, 450);
        p.image(a, ((float)p.width/4+(float)p.width/2) - 150, 160, 300, 450);


        p.fill(color.champagneMist);
        p.textSize(16);
        p.text(card1, (float)p.width/4 - 90, 210);
        p.text(card2, (float)p.width/2 - 90, 210);
        p.text(card3, (float)p.width/4+(float)p.width/2 - 90, 210);


        p.text(card11, (float)p.width/4 - 100, 280, (float)p.width/5-60, 480);
        p.text(card22, (float)p.width/2 - 100, 280,(float)p.width/5-60, 480);
        p.text(card33, (float)p.width/4+(float)p.width/2 - 90, 280, (float)p.width/5-60, 480);


        p.text(card111, (float)p.width/4 - 90, 480);
        p.text(card111, (float)p.width/2 - 90, 480);
        p.text(card111, (float)p.width/4+(float)p.width/2 - 90, 480);


        return mousePressed(p);
    }



    public int mousePressed(PApplet p) {

        if (isClicked(p, (float)p.width/4 - 150, 160, 300, 450)){
            return 1;
        }
        else if(isClicked(p, (float)p.width/2 - 150, 160, 300, 450)) {
           return 2;
        }
        else if(isClicked(p, (float)p.width/4+(float)p.width/2 - 150, 160, 300, 450)){
            return 3;
        }return 0;
    }

    private boolean isClicked(PApplet p, float x, float y, float w, float h) {
        return p.mouseX > x && p.mouseX < x + w &&
                p.mouseY > y && p.mouseY < y + h;
    }


}
