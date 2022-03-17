package com.solvd.laba.airportpackage;

public class Destination {
    private String name;
    private boolean hasDirectFlight;
    private int destinationNumber;
    private String continent;
    private int distanceFromBuenosAires;

    public Destination(String name, boolean hasDirectFlight, int destinationNumber, String continent, int distanceFromBuenosAires) {
        this.name = name;
        this.hasDirectFlight = hasDirectFlight;
        this.destinationNumber = destinationNumber;
        this.continent = continent;
        this.distanceFromBuenosAires = distanceFromBuenosAires;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDirectFlight() {
        return hasDirectFlight;
    }

    public void setHasDirectFlight(boolean hasDirectFlight) {
        this.hasDirectFlight = hasDirectFlight;
    }

    public int getDestinationNumber() {
        return destinationNumber;
    }

    public void setDestinationNumber(int destinationNumber) {
        this.destinationNumber = destinationNumber;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getDistanceFromBuenosAires() {
        return distanceFromBuenosAires;
    }

    public void setDistanceFromBuenosAires(int distanceFromBuenosAires) {
        this.distanceFromBuenosAires = distanceFromBuenosAires;
    }

    @Override
    public String toString() {
        return name + ", with destination number " + destinationNumber;
    }
}
