package com.solvd.airportpackage.model.person;

import com.solvd.airportpackage.model.Ticket;
import com.solvd.airportpackage.model.interface1.IChoose;
import com.solvd.airportpackage.model.interface1.IPay;

public class Passenger extends Person implements IChoose, IPay {
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

    @Override
    public void chooseDestination() {

        System.out.println("Where do i wanna go next, i think it might be some place overseas.");

    }

    @Override
    public void pay() {
        System.out.println("Passenger: Here you have");
    }
}
