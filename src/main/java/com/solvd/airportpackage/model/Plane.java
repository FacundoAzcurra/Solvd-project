package main.java.com.solvd.airportpackage.model;

import main.java.com.solvd.airportpackage.model.exception.PassengerNotFoundException;
import main.java.com.solvd.airportpackage.model.person.Employee;
import main.java.com.solvd.airportpackage.model.person.Passenger;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;


public class Plane {
    public static Logger LOGGER = org.apache.log4j.LogManager.getLogger(Plane.class);
    private int idNumber;
    private String make;
    private String model;
    private int year;
    private ArrayList<Passenger> passengers;
    private LinkedList<Employee> onboardCrew;


    public Plane(int idNumber, String make, String model, int year) {
        this.idNumber = idNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.passengers = new ArrayList<>();
        this.onboardCrew = new LinkedList<>();

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

    public LinkedList<Employee> getOnboardCrew() {
        return onboardCrew;
    }

    public void setOnboardCrew(LinkedList<Employee> onboardCrew) {
        this.onboardCrew = onboardCrew;
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

    public void addPassenger(Passenger addedPassenger) {
        this.passengers.add(addedPassenger);
    }

    public void addOnboardCrew(Employee addedOnboardCrew) {
        this.onboardCrew.add(addedOnboardCrew);
    }

    public void printArray() {
        for (int i = 0; i < passengers.size(); i++) {
            LOGGER.info(passengers.get(i));
        }

    }

    public Passenger getPassenger(int document) throws PassengerNotFoundException {
        Passenger passenger = null;

        for (int i = 0; i < this.passengers.size(); i++) {
            if (this.passengers.get(i).getDocument() == document) {
                passenger = this.passengers.get(i);
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

