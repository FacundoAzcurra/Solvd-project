package com.solvd.airportpackage.model.interface1;

import com.solvd.airportpackage.model.Ticket;
 @FunctionalInterface
public interface ITicketable {
    public Ticket createRandomTicket();
}
