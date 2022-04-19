package com.solvd.airportpackage.model.person;

public class AirportPolice extends com.solvd.airportpackage.model.person.Employee {
    private boolean isArmed;
    private int migrationOfficeNumber;

    public AirportPolice(int age, String sex, int document, String name, int employeeId, double wage) {
        super(age, sex, document, name, employeeId, wage);
    }

    public AirportPolice(int age, String sex, int document, String name, int employeeId, double wage, boolean isArmed, int migrationOfficeNumber) {
        super(age, sex, document, name, employeeId, wage);
        this.isArmed = isArmed;
        this.migrationOfficeNumber = migrationOfficeNumber;
    }

    public boolean isArmed() {
        return isArmed;
    }

    public void setArmed(boolean armed) {
        isArmed = armed;
    }

    public int getMigrationOfficeNumber() {
        return migrationOfficeNumber;
    }

    public void setMigrationOfficeNumber(int migrationOfficeNumber) {
        this.migrationOfficeNumber = migrationOfficeNumber;
    }

    @Override
    public String toString() {
        return "AirportPolice{" + "isArmed=" + isArmed + ", migrationOfficeNumber=" + migrationOfficeNumber + "} " + super.toString();
    }
}



