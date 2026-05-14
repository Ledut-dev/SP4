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

        i = p.loadImage("doc/sick_city_harbour_closeup.png");
        p.image(i, 0,0);


    }

    @Override
    public int render(PApplet p) {

        Random r= new Random();
        counter+=0.2;

    if(p.frameCount % 6 == 0 || p.frameCount % 8 == 0 ) {
        Ball b = new Ball
                (r.nextFloat(10),
                        40,
                        20,
                        200,
                        400,
                        r.nextFloat(90 + size),
                        color);

        b.render(p, color.neonChartreuse, color.electricIndigo);


        if (counter == 30) {
            size += 60;
        }

        if (counter > 32) {
            Ball c = new Ball
                    (r.nextFloat(10),
                            40,
                            20,
                            900,
                            300,
                            r.nextFloat(30),
                            color);

            c.render(p, color.neonChartreuse, color.electricIndigo);
        }
        if (counter > 37) {
            Ball d = new Ball
                    (r.nextFloat(10),
                            40,
                            20,
                            950,
                            280,
                            r.nextFloat(20),
                            color);

            d.render(p, color.neonChartreuse, color.electricIndigo);
        }
    }

    return 0;
    }



}
