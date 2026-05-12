package org.example;

import java.sql.*;
import java.util.Random;

public class DBConnector {
    Connection conn;

    public void connect(String url) {
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.print("Could not connect to database: " + url);
        }
    }

    public Disease getRandomDisease() {
        Disease disease = null;

        // Finder antallet af rækker i databasen
        int diseaseQuantity = 1; // Skal have en positiv value, ellers bliver Random sur
        String countQuery = """
                SELECT COUNT(*)
                FROM Diseases
                """;
        try {
            Statement countStm = conn.createStatement();
            ResultSet count = countStm.executeQuery(countQuery);
            if (count.next()) {
                diseaseQuantity = count.getInt(1);
            }
        } catch (SQLException e) {
            System.out.print("Failed to count");
        }

        // Tilfældigt tal mellem 1 og antallet af rækker
        Random random = new Random();
        int randomInt = random.nextInt(diseaseQuantity)+1;

        // Finder rækken med det tilfældige tal og konstruere en disease fra denne
        String query = """
                SELECT *
                FROM Diseases
                WHERE ROWID =""";
        query += "" + randomInt;

        try {
            Statement stm = conn.createStatement();
            ResultSet diseaseRS = stm.executeQuery(query);

            String name = diseaseRS.getString("Name");
            String type = diseaseRS.getString("Type");
            int mutationRate = diseaseRS.getInt("MutationRate");
            int stability = diseaseRS.getInt("Stability");
            String transmissionRoutes = diseaseRS.getString("TransmissionRoutes");
            int transmissionNumber = diseaseRS.getInt("TransmissionNumber");
            String symptoms = diseaseRS.getString("Symptoms");
            int incubationTime = diseaseRS.getInt("IncubationTime");
            int infectiousTime = diseaseRS.getInt("InfectiousTime");
            int prevalence = diseaseRS.getInt("Prevalence");
            String susceptibleGroups = diseaseRS.getString("SusceptibleGroups");
            int fatalityRate = diseaseRS.getInt("FatalityRate10000");
            Boolean antibiotics = diseaseRS.getBoolean("Antibiotics");
            Boolean antivirals = diseaseRS.getBoolean("Antivirals");

            disease = new Disease(
                    name,
                    type,
                    mutationRate,
                    stability,
                    transmissionRoutes,
                    transmissionNumber,
                    symptoms,
                    incubationTime,
                    infectiousTime,
                    prevalence,
                    susceptibleGroups,
                    fatalityRate,
                    antibiotics,
                    antivirals);

        } catch (SQLException e) {
            System.out.println("Failed to get random disease");
        }

        return disease;
    }
}
