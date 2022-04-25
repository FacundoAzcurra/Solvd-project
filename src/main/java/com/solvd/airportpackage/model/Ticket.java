package com.solvd.airportpackage.model;

import com.solvd.airportpackage.model.exception.IncorrectKilometersException;
import com.solvd.airportpackage.model.person.Passenger;

public class Ticket{

    private int ticketNumber;
    private int ticketDocument;
    private int flightDistance;
    private Passenger owner;

    public Ticket(int ticketNumber, int ticketDocument, int flightDistance, Passenger owner) {
        this.owner = owner;
        owner.setTicket(this);
        this.ticketNumber = ticketNumber;
        this.ticketDocument = ticketDocument;
        this.flightDistance = flightDistance;

    }


    public Passenger getOwner() {
        return owner;
    }

    public void setOwner(Passenger owner) {
        this.owner = owner;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getTicketDocument() {
        return ticketDocument;
    }

    public void setTicketDocument(int ticketDocument) {
        this.ticketDocument = ticketDocument;
    }

    public float getFlightDistance() {
        return flightDistance;
    }

    public void setFlightDistance(int flightDistance) {
        this.flightDistance = flightDistance;
    }

    /*0.08 USD PER KM*/
    public float getTicketPrice() throws IncorrectKilometersException {
        if (flightDistance <= 0) throw new IncorrectKilometersException();
        return (float) (flightDistance * 0.08);

    }


    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber=" + ticketNumber +
                ", ticketDocument=" + ticketDocument +
                ", flightDistance=" + flightDistance +
                ", owner=" + owner.getName() +
                '}';
    }

}
