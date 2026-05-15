package org.example;

import java.util.ArrayList;

import processing.core.PApplet;

public class ViewController extends PApplet {

    int index = 0;
    ArrayList<Scene> allViews;
    int chosenButton;
    String[] teamInfo;  //et String Array med en team navn og antal spillere skal parses.
    int[] chosenCards = new int[3];
    Scene currentView;

    // alle følgende metoder er nødvendige

    public void settings() {
        //størrelsen på vinduet
        size(1376, 768);

    }

    public void setup() {
        setUpScenes();
        allViews.get(index).enter(this);
        currentView=allViews.get(0);
//        if(index>0){
//            allViews.get(index).enter(this);
   //     }
    }

    public static void main(String[] args) {

        PApplet.main("org.example.ViewController");
    }


    public void draw() {
//evt. kalde draw fra gameController med et int index argument.
        // kan afspille alle intro scneer indtil en options menu skal bruges, hvis scene 1 kalder scene 2 osv.
        // sidste scene returnerer index på første options menu
        //loop der kører de første scener

        index = currentView.render(this);

        if(index>0 && index <3) {
            currentView = allViews.get(index);
            if (index == allViews.indexOf(currentView)) {
                currentView.enter(this);
            }
        }




        //options menu med 1 valg
        if (index == 3) {
            currentView = allViews.get(index);
            currentView.enter(this);
            chosenButton = currentView.render(this);
            index = 4;
        }

        //options menu , køres 3 gange, kan bruges til flere forskellige optionsmenuer
        if (index == 5 || index == 7) {
            currentView = allViews.get(index);
            currentView.enter(this);
            for (int c = 0; c < 3; c++) {
                chosenCards[c] = currentView.render(this);
            }
            index = 8;
        }

        if (index == 8) { //gennemløb af scener uden valg som i starten

            currentView = allViews.get(index);
            currentView.enter(this);
            index = currentView.render(this);

        }


    }


    public void setUpScenes() {
        allViews = new ArrayList<>();

        allViews.add(new SceneOne());
        allViews.add(new SceneTwo());
        allViews.add(new SceneThree());


        allViews.add(new ScreenOne());


        allViews.add(new SceneGameOver());


        //osv. her holdes styr på rækkefølgen

    }


}
