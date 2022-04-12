package com.solvd.airportpackage.util;

import com.solvd.airportpackage.model.Destination;
import com.solvd.airportpackage.model.Flight;
import com.solvd.airportpackage.model.Plane;
import com.solvd.airportpackage.model.Ticket;
import com.solvd.airportpackage.model.exception.IncorrectKilometersException;
import com.solvd.airportpackage.model.exception.NotANumberException;
import com.solvd.airportpackage.model.exception.PassengerNotFoundException;
import com.solvd.airportpackage.model.generic.CompareObjectField;
import com.solvd.airportpackage.model.person.Passenger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Airport {
    public static Logger LOGGER = LogManager.getLogger(Airport.class);

    public static void main(String[] args) throws PassengerNotFoundException, NotANumberException {

        Passenger passenger1 = new Passenger(20, "Male", 1578475, "Facundo Azcurra");
        Passenger passenger2 = new Passenger(22, "Female", 124578, "Lilita Carrio");
        Passenger passenger3 = new Passenger(54, "Male", 15455, "Tobias Arandano");
        Passenger passenger4 = new Passenger(38, "Female", 18754, "Laura Tobarez");

        LOGGER.info("Enter the name of the passenger");
        Scanner scPassengerName = new Scanner(System.in);
        passenger1.setName(scPassengerName.next());

        LOGGER.info("Hello " + passenger1.getName());

        Plane plane1 = new Plane(1, "boeing", "tutuca", 2020);
        plane1.addPassenger(passenger1);
        plane1.addPassenger(passenger2);
        plane1.addPassenger(passenger3);
        plane1.addPassenger(passenger4);
        Destination destination = new Destination("Belarus", true, 10, "Europe", 12807);
        Flight flight1 = new Flight("AR1", destination, "22:15-3/16/22");

        Scanner sccity = new Scanner(System.in);
        LOGGER.info("Enter the name of the city you want to travel.");
        destination.setName(sccity.nextLine());
        LOGGER.info("Enter the distance from Buenos Aires to destination in kilometers.");
        Scanner scdistance = new Scanner(System.in);
        destination.setDistanceFromBuenosAires(scdistance.nextInt());

        Ticket ticket1 = new Ticket(100, 1, destination.getDistanceFromBuenosAires());
        //LOGGER.info(ticket1.getTicketPrice()); /* Calculate the price of the ticket based in the distance from Buenos Aires*/

        LOGGER.info("Price of your flight:");
        try {
            LOGGER.info(ticket1.getTicketPrice() + " USD");
        } catch (IncorrectKilometersException e) {
            LOGGER.info(e);
        } catch (InputMismatchException e) {
            throw new NotANumberException(e);
        }
        try {
            LOGGER.info(plane1.getPassenger(124578));
        } catch (PassengerNotFoundException e) {
            LOGGER.info(e);
        }
        CompareObjectField comparador = new CompareObjectField();
        comparador.compareField(passenger1,passenger2,"name");
        }
    }




