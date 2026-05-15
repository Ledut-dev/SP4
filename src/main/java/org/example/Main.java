package org.example;

import processing.core.PApplet;

import java.util.ArrayList;


public class Main extends PApplet {


    Scene currentView;
    int i=0;
    ArrayList<Scene> allViews;



    public void settings(){
        size(1376,768);
    }


    public static void main(String[] args){

        //PApplet.main("org.example.Main");
    }

    public void setup(){
        allViews = new ArrayList<>();

        //SCENER ER GRAFIK MED BEVÆGELSE OG SCENARIER

        allViews.add(new SceneOne());
        allViews.add(new SceneTwo());
        allViews.add(new SceneThree());
        allViews.add(new SceneGameOver());

        //SCREENS ER MED KNAPPER

        allViews.add(new ScreenOne());



        allViews.get(2).enter(this);

    }

    public void draw(){



        allViews.get(2).render(this);






    }










}

