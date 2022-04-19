package com.solvd.airportpackage.model.exception;

public class PassengerNotFoundException extends NullPointerException {
    public PassengerNotFoundException() {
        super("Passenger not found. ");
    }
}
