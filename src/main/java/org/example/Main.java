package org.example;

import processing.core.PApplet;


public class Main extends PApplet {

    //størrelsen på vinduet
    public void settings(){
        size(600, 400);
    }


    static Scene s = new OpeningScene();

    public static void main(String[] args){

        PApplet.main("org.example.Main");

    }

    public void setUp(){
        s.enter(this);
    }

    public void draw(){
        s.render(this);
    }





}
