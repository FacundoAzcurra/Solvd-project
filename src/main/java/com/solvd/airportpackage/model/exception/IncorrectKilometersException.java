package com.solvd.airportpackage.model.exception;

public class IncorrectKilometersException extends RuntimeException {
    public IncorrectKilometersException() {
        super("Enter a value in kilometers greater than 0!");
    }
}
