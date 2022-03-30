package com.solvd.airportpackage;

import com.solvd.airportpackage.exceptions.IncorrectKilometersException;

public class Ticket<flightDistance> {

    private int ticketNumber;
    private int ticketDocument;
    private int flightDistance;

    public Ticket(int ticketNumber, int ticketDocument, int flightDistance) {

        this.ticketNumber = ticketNumber;
        this.ticketDocument = ticketDocument;
        this.flightDistance = flightDistance;
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

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber=" + ticketNumber +
                ", ticketDocument=" + ticketDocument +
                ", flightDistance=" + flightDistance +
                '}';
    }

    /*0.08 USD PER KM*/
    public float getTicketPrice() throws IncorrectKilometersException {
        if (flightDistance<=0) throw new IncorrectKilometersException();
        return (float) (flightDistance * 0.08);

}


}
