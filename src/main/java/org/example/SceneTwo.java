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

        i = p.loadImage("doc/city_map_watercolor_v4.png");
        p.image(i, 0,0);

    }

    @Override
    public void render(PApplet p) {

        Random r= new Random();


        if(p.frameCount % 3 == 0 || p.frameCount % 2 == 0 ) {

            Ball b = new Ball
                    (r.nextFloat(10),
                     40,
                     20,
                      290,
                      600,
                      r.nextFloat(90+size),
                      color);

            b.render(p, color);

        }


        if (p.frameCount % 10==0) {

            Ball c = new Ball
                    (r.nextFloat(4),
                    30,
                    25,
                    (1000+relationalPlacement),
                    (200+relationalPlacement),
                    r.nextFloat(55+size),
                    color);

            c.render(p, color);

        }

        if (p.frameCount % 20==0) {

//            p.fill(color.neonChartreuse, 80);
//            p.strokeWeight(r.nextFloat(6));
//            p.stroke(color.electricIndigo, 30);
//            p.circle((1000 - placement), (200 - placement), r.nextFloat(75+size));

            Ball d = new Ball
                    (r.nextFloat(6),
                    30,
                    80,
                    (1000-relationalPlacement),
                    (200-relationalPlacement),
                    r.nextFloat(75+size),
                    color);
            d.render(p, color);

        }

        if (p.frameCount % 5==0){

            Ball e = new Ball
                    (r.nextFloat(2),
                            30,
                            90,
                            (1000-relationalPlacement),
                            (200+relationalPlacement),
                            r.nextFloat(50+size),
                            color);
            e.render(p, color);

        }
        // for hver 1 i counter er der gået 1/10 sekund, et sekund er derfor = 6
        counter += 0.1;
       // System.out.println(counter);

//        if (counter > 30){ får den til at udvide sig i al uendelighed, så cool til afslutningsscene
//            size+=30;
        if (counter >30){
            size=30;
            relationalPlacement=40;
        }

    }



}
