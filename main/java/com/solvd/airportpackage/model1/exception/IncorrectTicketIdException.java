package com.solvd.airportpackage.model1.exception;

public class IncorrectTicketIdException extends RuntimeException {
    public IncorrectTicketIdException(String errorMessage) {
        super(errorMessage);
    }
}
