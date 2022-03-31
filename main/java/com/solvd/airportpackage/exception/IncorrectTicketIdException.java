package java.com.solvd.airportpackage.exception;

public class IncorrectTicketIdException extends RuntimeException {
    public IncorrectTicketIdException(String errorMessage) {
        super(errorMessage);
    }
}
