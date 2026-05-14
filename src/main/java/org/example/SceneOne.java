package org.example;

import processing.core.PApplet;
import processing.core.PImage;

import java.util.Random;

//size(1376,768);

public class SceneOne extends Scene {

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

        Random r= new Random();
        // for hver 1 i counter er der gået 1/10 sekund, et sekund er derfor = 6
        counter += 0.2;

        if(p.frameCount % 6 == 0 || p.frameCount % 8 == 0 ) {
            if (counter < 30) {
                Ball b = new Ball
                        (r.nextFloat(10),
                                40,
                                20,
                                1000,
                                200,
                                r.nextFloat(60 + size),
                                color);

                b.render(p, color.neonChartreuse, color.electricIndigo);


            }

            if (counter > 3.0) {

                Ball c = new Ball
                        (r.nextFloat(4),
                                30,
                                25,
                                (1000 + relationalPlacement),
                                (200 + relationalPlacement),
                                r.nextFloat(25 + size),
                                color);

                c.render(p, color.neonChartreuse, color.electricIndigo);


            }

            if (counter > 5.0) {

                Ball d = new Ball
                        (r.nextFloat(6),
                                30,
                                80,
                                (1000 - relationalPlacement),
                                (200 - relationalPlacement),
                                r.nextFloat(45 + size),
                                color);
                d.render(p, color.neonChartreuse, color.electricIndigo);

            }

            if (counter > 7.0) {
                Ball e = new Ball
                        (r.nextFloat(2),
                                30,
                                90,
                                (1000 - relationalPlacement),
                                (200 + relationalPlacement),
                                r.nextFloat(20 + size),
                                color);
                e.render(p, color.neonChartreuse, color.electricIndigo);
            }

            //FØRSTE SCENE SLUT, TEKSTBOKS STARTER, OG

            if (counter > 30 && counter < 30.2) {
                p.image(i, 0, 0);
            }

//        if (counter > 30){ får den til at udvide sig i al uendelighed, så cool til afslutningsscene
//            size+=30;
            if (counter > 30) {
                size = 30;
                relationalPlacement = 40;
            }

            if (counter >= 32) {
                p.fill(color.electricIndigo, 10);
                p.noStroke();
                p.rect(40, 40, 500, 300);
                p.textSize(20);
                p.fill(color.neonChartreuse);
                p.text("Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut ",
                        40, 40, 125, 125);
            }
        }

            if ( counter > 33) {

                if (p.frameCount % 6 == 0 || p.frameCount % 8 == 0) {

                    Ball b = new Ball
                            (r.nextFloat(15),
                                    40,
                                    20,
                                    290,
                                    600,
                                    r.nextFloat(90 + size),
                                    color);

                    b.render(p, color.neonChartreuse, color.electricIndigo);

                    Ball c = new Ball
                            (r.nextFloat(6),
                                    30,
                                    25,
                                    (1000 + relationalPlacement),
                                    (200 + relationalPlacement),
                                    r.nextFloat(55 + size),
                                    color);

                    c.render(p, color.neonChartreuse, color.electricIndigo);

                    Ball d = new Ball
                            (r.nextFloat(12),
                                    30,
                                    80,
                                    (1000 - relationalPlacement),
                                    (200 - relationalPlacement),
                                    r.nextFloat(75 + size),
                                    color);
                    d.render(p, color.neonChartreuse, color.electricIndigo);

                    Ball e = new Ball
                            (r.nextFloat(15),
                                    30,
                                    90,
                                    (1000 - relationalPlacement),
                                    (200 + relationalPlacement),
                                    r.nextFloat(50 + size),
                                    color);
                    e.render(p, color.neonChartreuse, color.electricIndigo);
                }


//        if (counter > 30){ får den til at udvide sig i al uendelighed, så cool til afslutningsscene
//            size+=30;
                if (counter > 40) {
                    size = 50;
                    relationalPlacement = 50;
                }
            }

            if (counter >= 100) {
                //returner en ind der kan bruges som index?
                return 1;
            }



        return 0;
        }








}
