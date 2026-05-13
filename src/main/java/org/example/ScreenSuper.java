package org.example;

import processing.core.PApplet;

public class ScreenSuper {

    ColorPalette color;


    public void enter(PApplet p){
        color = new ColorPalette(p);
    }


    void render(PApplet p){}
    void handleClick(){}



}
