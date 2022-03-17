package com.solvd.laba.airportpackage.persons;

public class SalesPerson extends Employee {
    private String airline;

    public SalesPerson(int age, String sex, int document, String name, int employeeId, double wage) {
        super(age, sex, document, name, employeeId, wage);
    }

    public SalesPerson(int age, String sex, int document, String name, int employeeId, double wage, String airline) {
        super(age, sex, document, name, employeeId, wage);
        this.airline = airline;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        airline = airline;
    }


    @Override
    public String toString() {
        return "SalesPerson{" +
                "airline='" + airline + '\'' +
                "} " + super.toString();
    }
}
