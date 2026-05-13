package org.example;

import processing.core.PApplet;

import java.util.ArrayList;


public class Main extends PApplet {

 //   ScreenSuper currentScene;
//    StartScreen startScreen;
//    GameScreen  gameScreen;
//    OptionScreen optionScreen;

    Scene currentView;

//    Scene sceneOne;
//    Scene sceneTwo;
//    Scene sceneThree;
//    Scene screenOne;
//    Scene screenTwo;

    int i;

    ArrayList<Scene> allViews;



    int cView = 0;

    public void settings(){
        //størrelsen på vinduet
        size(1376,768);
    }


    public static void main(String[] args){

        PApplet.main("org.example.Main");




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

       currentView = allViews.get(0);

        currentView.enter(this);


        System.out.println(allViews.get(2));






    }

    public void draw(){
        i = currentView.render(this); //starter startmenu


        if(i>0){
            if (i != allViews.indexOf(currentView)){
            currentView = allViews.get(i);
            currentView.enter(this);}
            i=currentView.render(this);
        }


        //en simplere måde at komme videre efter første sceneskift:

//        if (i == 1){
//            sceneTwo.render(this);
//        }
//        if(i == 2){}
//        if (i == 3){}




    }





}
