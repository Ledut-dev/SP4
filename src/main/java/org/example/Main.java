package org.example;

import processing.core.PApplet;


public class Main extends PApplet {

    //størrelsen på vinduet
    public void settings(){
        size(1376,768);
    }


    static Scene sceneOne = new SceneOne();
    static Scene sceneTwo = new SceneTwo();

    public static void main(String[] args){

        PApplet.main("org.example.Main");

    }

    public void setup(){
        sceneOne.enter(this);
    }

    public void draw(){
        sceneOne.render(this);
    }





}
