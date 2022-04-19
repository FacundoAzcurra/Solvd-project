package com.solvd.airportpackage.model.exception;

import java.util.InputMismatchException;

public class NotANumberException extends RuntimeException {
    public NotANumberException(InputMismatchException e) {
        super("Enter a valid kilometer in numbers!");
    }
}
