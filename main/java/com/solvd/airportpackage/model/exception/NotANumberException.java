package java.com.solvd.airportpackage.model.exception;

import java.util.InputMismatchException;

public class NotANumberException extends InputMismatchException {
    public NotANumberException(InputMismatchException e){
        super("Enter a valid kilometer in numbers!");
    }
}
