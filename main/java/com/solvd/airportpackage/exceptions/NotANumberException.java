package com.solvd.airportpackage.exceptions;

import java.util.InputMismatchException;

public class NotANumberException extends InputMismatchException {
    public NotANumberException(InputMismatchException e){
        super("Enter a valid kilometer in numbers!");
    }
}
