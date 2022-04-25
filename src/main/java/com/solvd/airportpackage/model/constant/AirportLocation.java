package com.solvd.airportpackage.model.constant;

public enum AirportLocation {
    CITY("Buenos Aires"), COUNTRY("Argentina");

    @Override
    public String toString() {
        return "AirportLocation{} " + super.toString();
    }

    AirportLocation(String name) {
    }
}
