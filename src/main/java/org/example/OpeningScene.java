package org.example;

import processing.core.PApplet;

public class OpeningScene extends Scene {

    float position1 = 0;
    float speed = 1;

    @Override
    public void enter(PApplet p) {
        p.background(0);
    }

    @Override
    public void render(PApplet p) {

        p.fill(50,100,200,30);
        p.strokeWeight (4);
        p.stroke(0);
        p.circle (position1,200, 80);
        position1= position1+speed;

        if (position1 > 399){
            speed = -1;
        }
        if (position1<1) {
            speed =1;
        }







    }
}
