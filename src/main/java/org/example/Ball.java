package org.example;

import processing.core.PApplet;
import processing.core.PGraphics;

import java.util.Random;

public class Ball {

    Random r = new Random();

    float strokeWeight;
    int strokeAlpha;

    int fillAlpha;
    double xPos;
    double yPos;

    float extend;

    ColorPalette color;



    Ball (float strokeWeight, int strokeAlpha, int fillAlpha, double xPos, double yPos, float extend, ColorPalette color){
        this.strokeWeight=strokeWeight;
        this.strokeAlpha=strokeAlpha;
        this.fillAlpha=fillAlpha;
        this.xPos=xPos;
        this.yPos=yPos;
        this.extend=extend;
        this.color=color;
    }



    public void render(PApplet p, int fillColor, int strokeColor){

        p.fill(fillColor,fillAlpha);
        p.strokeWeight(strokeWeight);
        p.stroke(strokeColor, strokeAlpha);
        p.circle((float)xPos, (float)yPos, extend);

    }


    public double getxPos() {
        return xPos;
    }

    public double getyPos() {
        return yPos;
    }
}
