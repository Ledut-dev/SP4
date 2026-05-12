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

        i = p.loadImage("doc/city_map_watercolor_v4.png");
        p.image(i, 0,0);

    }

    @Override
    public void render(PApplet p) {

        Random r= new Random();

        if(p.frameCount % 3 == 0 || p.frameCount % 2 == 0 ) {
//            p.fill(color.neonChartreuse, 20);
//            p.strokeWeight(r.nextFloat(10));
//            p.stroke(color.electricIndigo, 40);
//            p.circle(xposition, yposition, r.nextFloat(60)+size);
//
            Ball b = new Ball
                    (r.nextFloat(10),
                            40,
                            20,
                            1000,
                            200,
                            r.nextFloat(60+size),
                            color);

            b.render(p, color);


        }

        if (counter >3.0 && p.frameCount % 10==0) {

            Ball c = new Ball
                    (r.nextFloat(4),
                            30,
                            25,
                            (1000+relationalPlacement),
                            (200+relationalPlacement),
                            r.nextFloat(25+size),
                            color);

            c.render(p, color);



        }

        if (counter >5.0 && p.frameCount % 20==0) {

//            p.fill(color.neonChartreuse, 80);
//            p.strokeWeight(r.nextFloat(6));
//            p.stroke(color.electricIndigo, 30);
//            p.circle((xposition - relationalPlacement), (yposition - relationalPlacement), r.nextFloat(45+size));

            Ball d = new Ball
                    (r.nextFloat(6),
                            30,
                            80,
                            (1000-relationalPlacement),
                            (200-relationalPlacement),
                            r.nextFloat(45+size),
                            color);
            d.render(p, color);

        }

        if (counter >7.0 && p.frameCount % 5==0){
            Ball e = new Ball
                    (r.nextFloat(2),
                            30,
                            90,
                            (1000-relationalPlacement),
                            (200+relationalPlacement),
                            r.nextFloat(20+size),
                            color);
            e.render(p, color);
        }

        // for hver 1 i counter er der gået 1/10 sekund, et sekund er derfor = 6
        counter += 0.2;
        System.out.println(counter);

//        if (counter > 30){ får den til at udvide sig i al uendelighed, så cool til afslutningsscene
//            size+=30;
        if (counter >30){
            size=30;
            relationalPlacement=40;
        }

        if (counter >= 32) {
         p.fill(255, 10);
         p.noStroke();
         p.rect(100,100, 500, 500);
         p.fill(0);
         p.textSize(12);
         p.stroke(0);
         p.textureWrap(10);
         p.text("Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                 "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                 "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut " +
                 "aliquip ex ea commodo consequat. Duis aute irure dolor in " +
                 "reprehenderit in voluptate velit esse cillum dolore eu fugiat" +
                 " nulla pariatur. Excepteur sint occaecat cupidatat non proident," +
                 " sunt in culpa qui officia deserunt mollit anim id est laborum.", 150, 150);
        }

//        if (counter > 35){
//            p.noLoop();
//
//        }


        }








}
