package com.solvd.airportpackage.model.person;

import com.solvd.airportpackage.model.Ticket;

public class Passenger extends Person {
    private Ticket ticket;
    private int numberOfBags;

    public Passenger(int age, String sex, int document, String name) {
        super(age, sex, document, name);
    }

    public Passenger(int age, String sex, int document, String name, Ticket ticket, int numberOfBags) {
        super(age, sex, document, name);
        this.ticket = ticket;
        this.numberOfBags = numberOfBags;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "ticket=" + ticket +
                ", numberOfBags=" + numberOfBags +
                "} " + super.toString();
    }
}
