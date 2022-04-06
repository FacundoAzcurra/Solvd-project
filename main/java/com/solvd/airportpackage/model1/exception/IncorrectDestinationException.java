package com.solvd.airportpackage.model1.exception;

public class IncorrectDestinationException extends RuntimeException {
    public IncorrectDestinationException(String errorMessage) {
        super(errorMessage);
    }
}
