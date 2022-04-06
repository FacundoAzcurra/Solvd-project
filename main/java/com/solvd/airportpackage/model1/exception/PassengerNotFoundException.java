package com.solvd.airportpackage.model1.exception;

public class PassengerNotFoundException extends NullPointerException {
    public PassengerNotFoundException() {
        super("Passenger not found. ");
    }
}
