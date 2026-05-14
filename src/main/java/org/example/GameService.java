package org.example;

import java.util.ArrayList;

public class GameService {

    private DiseaseDao diseaseDao;
    private ScenarioDao scenarioDao;
    private CardDao cardDao;
    private RoleDao roleDao;
    private Game game;

    public GameService(){
        this.diseaseDao = new DiseaseDao();
        this.scenarioDao = new ScenarioDao();
        this.cardDao = new CardDao();
        this.roleDao = new RoleDao();
    }

    public void setupNewGame(String teamName){
        Disease enemy = diseaseDao.getRandomDisease;
        this.game = new Game(teamName, enemy);
        setGameScenario(0);
    }

    public Game getGame(){
        return this.game;
    }

    public void setRandomGameScenario(){
        game.setCurrentScenario(scenarioDao.getRandomScenario());
        int scenarioID = game.getCurrentScenario().getScenarioID();
        game.getCurrentScenario().setScenarioCards(cardDao.getAllByScenarioID(scenarioID));
    }

    public void setGameScenario(int ScenarioID){
        game.setCurrentScenario(scenarioDao.getScenarioByID(ScenarioID));
        game.getCurrentScenario().setScenarioCards(cardDao.getAllByScenarioID(ScenarioID));
    }

    public ArrayList<String> calculateRoundEffects(){

        ArrayList<String> changedAttributesValues = new ArrayList<>();
        int totalEffect = 0;
        //
        for (Card c : game.getCurrentScenario().getPickedCards()){
            changedAttributesValues.add(c.getAffectedValue() + "," + c.getEffectAmount() + ";");
            totalEffect += c.getEffectAmount();
        }

        game.getDisease().changeTransmissionRate(totalEffect);
        return changedAttributesValues;
    }




}
