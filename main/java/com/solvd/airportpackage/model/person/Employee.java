package com.solvd.airportpackage.model.person;

public class Employee extends com.solvd.airportpackage.model.person.Person {
    private int employeeId;
    private double wage;

    public Employee(int age, String sex, int document, String name) {
        super(age, sex, document, name);
    }

    public Employee(int age, String sex, int document, String name, int employeeId, double wage) {
        super(age, sex, document, name);
        this.employeeId = employeeId;
        this.wage = wage;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", wage=" + wage +
                "} " + super.toString();
    }
}
