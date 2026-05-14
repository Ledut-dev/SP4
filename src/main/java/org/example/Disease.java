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

    public Disease(String diseaseName, String diseaseType, int mutationRate, int stability, int transmissionRate, int incubationTime, int infectionTime, int prevalence, int fatalityRate, Boolean antibioticTreatment, Boolean antiviralTreatment) {
        this.diseaseName = diseaseName;
        this.diseaseType = DiseaseType.valueOf(diseaseType.toUpperCase());
        this.mutationRate = mutationRate;
        this.stability = stability;
        this.transmissionRate = transmissionRate;
        this.incubationTime = incubationTime;
        this.infectionTime = infectionTime;
        this.prevalence = prevalence;
        this.fatalityRate = fatalityRate;
        this.antibioticTreatment = antibioticTreatment;
        this.antiviralTreatment = antiviralTreatment;
    }

    public void addTransmissionRoutes(ArrayList<TransmissionRoute> transmissionRoutes){
        this.transmissionRoutes = transmissionRoutes;
    }

    public void addSymptoms(ArrayList<Symptom> symptoms){
        this.symptoms = symptoms;
    }

    public void addSusceptibleGroups(ArrayList<SusceptibleGroup> susceptibleGroups){
        this.susceptibleGroups = susceptibleGroups;
    }

    public String toString() {
        return "Disease: " + this.diseaseName;
    } // Brugt til test
}
