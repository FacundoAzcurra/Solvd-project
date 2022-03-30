package com.solvd.airportpackage;

import com.solvd.airportpackage.exceptions.PassengerNotFoundException;
import com.solvd.airportpackage.persons.Passenger;

import java.util.ArrayList;

public class Plane{
    private int idNumber;
    private String make;
    private String model;
    private int year;
    private ArrayList<Passenger> passengers;


    public Plane(int idNumber, String make, String model, int year) {
        this.idNumber = idNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.passengers = new ArrayList<>();

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

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void addPassenger(Passenger addedPassenger){
        passengers.add(addedPassenger);
    }
public void printArray()
    {
        for (int i = 0; i < passengers.size(); i++){
            System.out.println(passengers.get(i));
        }

    }
    public Passenger getPassenger(int document,ArrayList<Passenger> passengers) throws PassengerNotFoundException {
        Passenger passenger = null;

        for(int i = 0 ; i < passengers.size(); i++){
            if (passengers.get(i).getDocument()==document){
                passenger=passengers.get(i);
            }
        }
        if (passenger == null) throw new PassengerNotFoundException();
       return passenger;
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

