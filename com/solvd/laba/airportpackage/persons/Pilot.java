package com.solvd.laba.airportpackage.persons;

public class Pilot extends Employee {
    private int pilotLicense;

    public Pilot(int age, String sex, int document, String name, int employeeId, double wage) {
        super(age, sex, document, name, employeeId, wage);
    }

    public Pilot(int age, String sex, int document, String name, int employeeId, double wage, int pilotLicense) {
        super(age, sex, document, name, employeeId, wage);
        this.pilotLicense = pilotLicense;
    }

    public int getPilotLicense() {
        return pilotLicense;
    }

    public void setPilotLicense(int pilotLicense) {
        this.pilotLicense = pilotLicense;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "pilotLicense=" + pilotLicense +
                "} " + super.toString();
    }
}
