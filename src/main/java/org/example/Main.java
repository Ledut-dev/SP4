package org.example;

import processing.core.PApplet;

import java.util.ArrayList;


public class Main extends PApplet {


    Scene currentView;
    int i=0;
    ArrayList<Scene> allViews;



    public void settings(){
        //størrelsen på vinduet
        size(1376,768);
    }


    public static void main(String[] args){

        PApplet.main("org.example.Main");

        //String currentPlayer = gameController.getPlayerName;


    }

    public void setup(){
        allViews = new ArrayList<>();

        //SCENER ER GRAFIK MED BEVÆGELSE OG SCENARIER

        allViews.add(new SceneOne());
        allViews.add(new SceneTwo());
        allViews.add(new SceneThree());


        //SCREENS ER MED KNAPPER

        allViews.add(new ScreenOne());


        //allViews.add(new ScreenTwo());

       // Scene screenOne  = new ScreenOne(); // START SCREEN
        //static Screen  screenTwo  = new ScreenTwo();
        //static Screen screenThree = new ScreenThree(); //OPTIONS SCREEN

      // currentView = allViews.get(i);

        //currentView.enter(this);
        allViews.get(2).enter(this);

    }

    public void draw(){



        allViews.get(2).render(this);






        }










}
