package com.solvd.airportpackage;

public class Plane {
    private int idNumber;
    private String make;
    private String model;
    private int year;


    public Plane(int idNumber, String make, String model, int year) {
        this.idNumber = idNumber;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Plane{" +
                "idNumber=" + idNumber +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

