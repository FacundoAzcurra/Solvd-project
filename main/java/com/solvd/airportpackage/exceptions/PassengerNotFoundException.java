package com.solvd.airportpackage.exceptions;

public class PassengerNotFoundException extends NullPointerException{
    public PassengerNotFoundException(){
        super("Passenger not found. ");
    }
}
