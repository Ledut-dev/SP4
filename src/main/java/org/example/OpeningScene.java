package org.example;

import processing.core.PApplet;

import java.awt.*;


public class OpeningScene extends Scene {

    float xposition = 200;
    float yposition= 150;
    float speed = 1;

    int prussianBlue;
    int apricotCream;
    int limeCream;
    int mediumSlateBlue;
    int neonChartreuse;
    int electricIndigo;
    int champagneMist;


    @Override
    public void enter(PApplet p) {
        prussianBlue = p.color(18,40,73);
        apricotCream = p.color(251,198,128);
        limeCream = p.color (244,255,161);
        mediumSlateBlue = p.color(143,115,255);
        neonChartreuse = p.color (231,255,46);
        electricIndigo = p.color(90,48,255);
        champagneMist= p.color(255,233,204);

        p.background(limeCream);
    }

    @Override
    public void render(PApplet p) {

        p.fill(mediumSlateBlue);
        p.strokeWeight (4);
        p.stroke(neonChartreuse);
        p.circle (xposition,yposition, 40);
        xposition= xposition+speed;

        if (xposition > 599){
            speed = -1;
        }
        if (xposition<1) {
            speed =1;
        }


    }







}
