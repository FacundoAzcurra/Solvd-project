package java.com.solvd.airportpackage.exception;

public class PassengerNotFoundException extends NullPointerException{
    public PassengerNotFoundException(){
        super("Passenger not found. ");
    }
}
