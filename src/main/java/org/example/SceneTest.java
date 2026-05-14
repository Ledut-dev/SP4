package org.example;

import processing.core.PApplet;
import processing.core.PImage;

import java.util.Random;

public class SceneTest extends Scene {

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

    }

    @Override
    public int render(PApplet p) {
        System.out.println("SceneThree render");
        return 3;
    }








}
