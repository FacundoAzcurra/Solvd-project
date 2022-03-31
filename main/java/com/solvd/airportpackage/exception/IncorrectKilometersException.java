package java.com.solvd.airportpackage.exception;

import java.util.InputMismatchException;

public class IncorrectKilometersException extends InputMismatchException {
    public IncorrectKilometersException()
    {
        super("Enter a value in kilometers greater than 0!");
    }
}
