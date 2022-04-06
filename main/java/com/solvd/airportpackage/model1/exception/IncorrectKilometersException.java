package com.solvd.airportpackage.model1.exception;

import java.util.InputMismatchException;

public class IncorrectKilometersException extends InputMismatchException {
    public IncorrectKilometersException() {
        super("Enter a value in kilometers greater than 0!");
    }
}
