package org.example;

import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;

import java.util.ArrayList;
import java.util.Random;

public class SceneTwo extends Scene{

    PImage i;
    float size=0;
    float relationalPlacement=25;
    double counter;





    @Override
    public void enter(PApplet p) {
        super.enter(p);

        counter = 0.0;

        i = p.loadImage("doc/sick_city_futuristic_v2.png");
        p.image(i, 0,0);

        System.out.println("scene 2");

    }

    @Override
    public int render(PApplet p) {

        Random r= new Random();

        Ball b = new Ball(20, 80, 70, 600, 300, 100, color);
        b.render(p, color.electricIndigo, color.champagneMist);

        counter+=0.5;
        System.out.println(counter);

        if(counter > 70){

            return 2;
        } return 0;


    }



}
