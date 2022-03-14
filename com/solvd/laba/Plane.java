package com.solvd.laba;

public class Plane {
    private String make;
    private String model;
    private int year;

    Plane(String make, String model, int year) {

        this.make = make;
        this.model = model;
        this.year = year;
    }
 public String getMake(){
        return make;
    }
public String getModel(){
        return model;
}
public int getYear(){
        return year;
}
}
