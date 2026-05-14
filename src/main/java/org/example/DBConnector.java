package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class DBConnector {
    private static Connection conn;

    public void connect(String url) {
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.print("Could not connect to database: " + url);
        }
    }

    public Disease getRandomDisease() {
        Disease disease = null;

        int diseaseQuantity = getDiseaseQuantity();

        // Tilfældigt tal mellem 1 og antallet af rækker
        Random random = new Random();
        int randomInt = random.nextInt(diseaseQuantity)+1;

        disease = getDiseaseFromDB(randomInt);


        return disease;
    }

    public int getDiseaseQuantity() {
        int diseaseQuantity = -1;
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
        return diseaseQuantity;
    }

    public Disease getDiseaseFromDB(int id) {
        Disease disease = null;
        String query = """
                SELECT *
                FROM Diseases
                WHERE ROWID =""";
        query += " " + id;

        try {
            Statement stm = conn.createStatement();
            ResultSet diseaseRS = stm.executeQuery(query);

            String name = diseaseRS.getString("Name");
            String type = diseaseRS.getString("Type");
            int mutationRate = diseaseRS.getInt("MutationRate");
            int stability = diseaseRS.getInt("Stability");
            int transmissionNumber = diseaseRS.getInt("TransmissionNumber");
            int incubationTime = diseaseRS.getInt("IncubationTime");
            int infectiousTime = diseaseRS.getInt("InfectiousTime");
            int prevalence = diseaseRS.getInt("Prevalence");
            int fatalityRate = diseaseRS.getInt("FatalityRate10000");
            Boolean antibiotics = diseaseRS.getBoolean("Antibiotics");
            Boolean antivirals = diseaseRS.getBoolean("Antivirals");

            disease = new Disease(
                    name,
                    type,
                    mutationRate,
                    stability,
                    transmissionNumber,
                    incubationTime,
                    infectiousTime,
                    prevalence,
                    fatalityRate,
                    antibiotics,
                    antivirals);

        } catch (SQLException e) {
            System.out.println("Failed to get random disease");
        }

        ArrayList<TransmissionRoute> transmissionRoutes = getTransmissionRoutes(id);
        ArrayList<Symptom> symptoms = getSymptoms(id);
        ArrayList<SusceptibleGroup> susceptibleGroups = getSusceptibleGroups(id);

        disease.addTransmissionRoutes(transmissionRoutes);
        disease.addSymptoms(symptoms);
        disease.addSusceptibleGroups(susceptibleGroups);

        return disease;
    }

    public ArrayList<TransmissionRoute> getTransmissionRoutes(int id) {
        ArrayList<TransmissionRoute> transmissionRoutes = null;
        try {
            PreparedStatement statement = conn.prepareStatement("""
                SELECT TransmissionRouteID
                FROM DiseaseTransmissionRoutes
                WHERE DiseaseID = ?""");
            statement.setInt(1, id);
            ResultSet linkedRS = statement.executeQuery();
            transmissionRoutes = rsToTransmissionRoutes(linkedRS);
        } catch (SQLException e) {
            System.out.println("Could not load transmission routes.");
        }
        return transmissionRoutes;
    }

    public ArrayList<Symptom> getSymptoms(int id) {
        ArrayList<Symptom> symptoms = null;
        try {
            PreparedStatement statement = conn.prepareStatement("""
                SELECT SymptomID
                FROM DiseaseSymptoms
                WHERE DiseaseID = ?""");
            statement.setInt(1, id);
            ResultSet linkedRS = statement.executeQuery();
            symptoms = rsToSymptoms(linkedRS);
        } catch (SQLException e) {
            System.out.println("Could not load transmission routes.");
        }
        return symptoms;
    }

    public ArrayList<SusceptibleGroup> getSusceptibleGroups(int id) {
        ArrayList<SusceptibleGroup> susceptibleGroups = null;
        try {
            PreparedStatement statement = conn.prepareStatement("""
                SELECT SusceptibleGroupID
                FROM DiseaseSusceptibleGroups
                WHERE DiseaseID = ?""");
            statement.setInt(1, id);
            ResultSet linkedRS = statement.executeQuery();
            susceptibleGroups = rsToSusceptibleGroups(linkedRS);
        } catch (SQLException e) {
            System.out.println("Could not load transmission routes.");
        }
        return susceptibleGroups;
    }

    private ArrayList<Integer> rsToInts(ResultSet rs) throws SQLException {
        ArrayList<Integer> ints = new ArrayList<>();
        while (rs.next()) {
            int i = rs.getInt(1);
            ints.add(i);
        }
        return ints;
    }

    private ArrayList<TransmissionRoute> rsToTransmissionRoutes(ResultSet rs) throws SQLException {
        ArrayList<Integer> ints = rsToInts(rs);
        ArrayList<TransmissionRoute> transmissionRoutes = new ArrayList<>();
        for (Integer i : ints) {
            try {
                PreparedStatement statement = conn.prepareStatement("""
                SELECT TransmissionRoute
                FROM TransmissionRoutes
                WHERE TransmissionRouteID = ?""");
                statement.setInt(1,i);
                ResultSet tr = statement.executeQuery();
                TransmissionRoute t = TransmissionRoute.valueOf(tr.getString(1).trim().toUpperCase());
                transmissionRoutes.add(t);
            } catch (SQLException e) {
                System.out.println("Could not convert transmission routes");
            }
        }
        return transmissionRoutes;
    }

    private ArrayList<Symptom> rsToSymptoms(ResultSet rs) throws SQLException {
        ArrayList<Integer> ints = rsToInts(rs);
        ArrayList<Symptom> symptoms = new ArrayList<>();
        for (Integer i : ints) {
            try {
                PreparedStatement statement = conn.prepareStatement("""
                SELECT Symptom
                FROM Symptoms
                WHERE SymptomID = ?""");
                statement.setInt(1,i);
                ResultSet ss = statement.executeQuery();
                Symptom s = Symptom.valueOf(ss.getString(1).trim().toUpperCase());
                symptoms.add(s);
            } catch (SQLException e) {
                System.out.println("Could not convert symptoms");
            }
        }
        return symptoms;
    }

    private ArrayList<SusceptibleGroup> rsToSusceptibleGroups(ResultSet rs) throws SQLException {
        ArrayList<Integer> ints = rsToInts(rs);
        ArrayList<SusceptibleGroup> susceptibleGroups = new ArrayList<>();
        for (Integer i : ints) {
            try {
                PreparedStatement statement = conn.prepareStatement("""
                SELECT SusceptibleGroup
                FROM SusceptibleGroups
                WHERE SusceptibleGroupID = ?""");
                statement.setInt(1,i);
                ResultSet sg = statement.executeQuery();
                SusceptibleGroup s = SusceptibleGroup.valueOf(sg.getString(1).trim().toUpperCase());
                susceptibleGroups.add(s);
            } catch (SQLException e) {
                System.out.println("Could not convert susceptible groups");
            }
        }
        return susceptibleGroups;
    }

    public static Connection getConnection() {
        return conn;
    }
}
