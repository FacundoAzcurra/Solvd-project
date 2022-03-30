package com.solvd.airportpackage.exceptions;

public class IncorrectTicketIdException extends RuntimeException {
    public IncorrectTicketIdException(String errorMessage) {
        super(errorMessage);
    }
}
