package org.example;

import processing.core.PApplet;
import processing.core.PGraphics;

import java.awt.*;

public class Scene {

    ColorPalette color;


   public void enter(PApplet p){
       color = new ColorPalette(p);


   }

     public int render(PApplet p){
        return 0;
     }



}