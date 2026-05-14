package org.example;

import processing.core.PApplet;
import processing.core.PImage;

import java.util.Random;

public class SceneThree extends Scene {

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

        Ball b = new Ball
                (r.nextFloat(10),
                        40,
                        20,
                        200,
                        400,
                        r.nextFloat(150),
                        color);
        b.render(p, color.neonChartreuse, color.electricIndigo);

            Ball c = new Ball
                    (r.nextFloat(10),
                            10,
                            10,
                            900,
                            300,
                            r.nextFloat(30),
                            color);
            c.render(p, color.neonChartreuse, color.electricIndigo);

            Ball d = new Ball
                    (r.nextFloat(10),
                            10,
                            10,
                            950,
                            280,
                            r.nextFloat(20),
                            color);
            d.render(p, color.neonChartreuse, color.electricIndigo);


            if (counter > 4){
                p.fill(color.prussianBlue, 10);
                p.noStroke();
                p.rect(0,0, p.width, p.height);

                p.rect(((float)p.width/2)-200,((float)p.height/2)+100, ((float)p.width/2)+200, ((float)p.height/2)+200);
                p.textSize(30);
                p.fill(color.champagneMist);
                p.fill(color.neonChartreuse);
                p.text("Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut ",
                        ((float)p.width/2)-500,200, 1000, 600);


            }


        return 0;
    }



}
