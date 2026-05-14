package org.example;

import java.util.ArrayList;

public class Disease {
    String diseaseName;
    DiseaseType diseaseType;
    int mutationRate;
    int stability;
    ArrayList<TransmissionRoute> transmissionRoutes;
    int transmissionRate;
    ArrayList<Symptom> symptoms;
    int incubationTime;
    int infectionTime;
    int prevalence;
    ArrayList<SusceptibleGroup> susceptibleGroups;
    int fatalityRate;
    Boolean antibioticTreatment;
    Boolean antiviralTreatment;

    public Disease(String diseaseName, String diseaseType, int mutationRate, int stability, String transmissionRoutes, int transmissionRate, String symptoms, int incubationTime, int infectionTime, int prevalence, String susceptibleGroups, int fatalityRate, Boolean antibioticTreatment, Boolean antiviralTreatment) {
        this.diseaseName = diseaseName;
        this.diseaseType = DiseaseType.valueOf(diseaseType.toUpperCase());
        this.mutationRate = mutationRate;
        this.stability = stability;
        this.transmissionRoutes = new ArrayList<>();
        for (String s : stringToArrayList(transmissionRoutes)) {
            this.transmissionRoutes.add(TransmissionRoute.valueOf(s.toUpperCase()));
        }
        this.transmissionRate = transmissionRate;
        this.symptoms = new ArrayList<>();
        for (String s : stringToArrayList(symptoms)) {
            this.symptoms.add(Symptom.valueOf(s.toUpperCase()));
        }
        this.incubationTime = incubationTime;
        this.infectionTime = infectionTime;
        this.prevalence = prevalence;
        this.susceptibleGroups = new ArrayList<>();
        for (String s : stringToArrayList(susceptibleGroups)) {
            this.susceptibleGroups.add(SusceptibleGroup.valueOf(s.toUpperCase()));
        }
        this.fatalityRate = fatalityRate;
        this.antibioticTreatment = antibioticTreatment;
        this.antiviralTreatment = antiviralTreatment;
    }

    // Anvendes fordi der gives en string af databasen
    private ArrayList<String> stringToArrayList(String string) {
        ArrayList<String> list = new ArrayList<>();
        if (string==null) {
            return list;
        }
        String[] array = string.split(",");
        for (String s : array) {
            if (s.equals(" muscle pan")) {  // Stavefejl i databasen, burde ordnes, men denne fanger den
                s = " muscle aches";
            }
            list.add(s.replaceAll("\\s+","").replaceAll("-","").replaceAll("/","")); // Fjerner mellemrum, skråstreger og bindestreger, så Enum ikke bliver sur
        }
        return list;
    }

    public String toString() {
        return "Disease: " + this.diseaseName;
    } // Brugt til test

    public void changeTransmissionRate(int amount){
        this.transmissionRate += amount;
    }


}
