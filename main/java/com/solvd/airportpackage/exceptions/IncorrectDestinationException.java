package com.solvd.airportpackage.exceptions;

public class IncorrectDestinationException extends RuntimeException {
    public IncorrectDestinationException(String errorMessage) {
        super(errorMessage);
    }
}
