package org.example;

import processing.core.PApplet;
import processing.core.PImage;

import java.util.Random;

public class SceneThree extends Scene {

    PImage i;
    PImage a;
    float size=0;
    float relationalPlacement=25;
    double counter;





    @Override
    public void enter(PApplet p) {
        super.enter(p);

        counter = 0.0;

        i = p.loadImage("doc/sick_city_harbour_closeup.png");
        a= p.loadImage("doc/sick_city_textbox_only.png");

        p.image(i, 0,0);
        p.image(i, 0,0);

        System.out.println("scene three enter");


    }

    @Override
    public int render(PApplet p) {
        System.out.println(counter);
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

        if(counter >= 20){
            p.fill(color.prussianBlue, 10);
            p.noStroke();
            p.rect(0,0, p.width, p.height);
        }


            if (counter > 25){

                    p.tint(255, 20);
                    p.image(a,(float)p.width/2-250, (float)p.height/2-375, 500, 750);

                    p.textSize(30);
                    p.fill(color.neonChartreuse, 30);
                    p.text("Patient 0 er taget på havnen ..." +
                                    "..." +
                                    "...",
                            (float)p.width/2-180, (float)p.height/2-180, 360, 360);
                }


//                p.fill(color.prussianBlue, 10);
//                p.noStroke();
//                p.rect(0,0, p.width, p.height);

               // p.rect(((float)p.width/2)-200,((float)p.height/2)+100, ((float)p.width/2)+200, ((float)p.height/2)+200);

        if(counter >= 50){
            return 3;
        }

        return 0;
            }







}
