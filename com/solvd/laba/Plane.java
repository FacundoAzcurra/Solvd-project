package com.solvd.laba;

public class Plane {
    private String make;
    private String model;
    private int year;
    private String colour;
    private int seats;


    Plane(String make, String model, int year, String colour, int seats) {

        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
        this.setColour(colour);
        this.setSeats(seats);
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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}

