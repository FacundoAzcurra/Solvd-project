package main.java.com.solvd.airportpackage.model.exception;

public class IncorrectTicketIdException extends RuntimeException {
    public IncorrectTicketIdException(String errorMessage) {
        super(errorMessage);
    }
}