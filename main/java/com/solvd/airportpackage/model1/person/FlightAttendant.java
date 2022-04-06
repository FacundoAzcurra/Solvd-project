package com.solvd.airportpackage.model1.person;

import java.util.Arrays;

public class FlightAttendant extends Employee {
    private boolean hasPCRTraining;
    private String[] languages;

    public FlightAttendant(int age, String sex, int document, String name, int employeeId, double wage) {
        super(age, sex, document, name, employeeId, wage);
    }

    public FlightAttendant(int age, String sex, int document, String name, int employeeId, double wage, boolean hasPCRTraining, String[] languages) {
        super(age, sex, document, name, employeeId, wage);
        this.hasPCRTraining = hasPCRTraining;
        this.languages = languages;
    }

    public boolean isHasPCRTraining() {
        return hasPCRTraining;
    }

    public void setHasPCRTraining(boolean hasPCRTraining) {
        this.hasPCRTraining = hasPCRTraining;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "FlightAttendant{" +
                "hasPCRTraining=" + hasPCRTraining +
                ", languages=" + Arrays.toString(languages) +
                "} " + super.toString();
    }
}
