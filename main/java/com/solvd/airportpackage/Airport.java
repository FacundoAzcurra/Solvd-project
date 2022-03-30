package com.solvd.airportpackage;

import com.solvd.airportpackage.exceptions.IncorrectKilometersException;
import com.solvd.airportpackage.exceptions.NotANumberException;
import com.solvd.airportpackage.exceptions.PassengerNotFoundException;
import com.solvd.airportpackage.persons.Passenger;
import com.solvd.airportpackage.persons.SalesPerson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Airport {
    public static Logger LOGGER = LogManager.getLogger(Airport.class);

    public static void main(String[] args) throws PassengerNotFoundException {

        Passenger passenger1 = new Passenger(20, "Male", 1578475, "Facundo Azcurra");
        Passenger passenger2 = new Passenger(22, "Female", 124578, "Lilita Carrio");
        Passenger passenger3 = new Passenger(54, "Male", 15455, "Tobias Arandano");
        Passenger passenger4 = new Passenger(38, "Female", 18754, "Laura Tobarez");
        System.out.println("Enter the name of the passenger");
        Scanner scPassengerName = new Scanner(System.in);
        passenger1.setName(scPassengerName.next());

        System.out.println("Hello " + passenger1.getName());

        Plane plane1 = new Plane(1, "boeing", "tutuca", 2020);
        plane1.addPassenger(passenger1);
        plane1.addPassenger(passenger2);
        plane1.addPassenger(passenger3);
        plane1.addPassenger(passenger4);
        Destination destination = new Destination("Belarus", true, 10, "Europe", 12807);
        Flight flight1 = new Flight("AR1", destination, "22:15-3/16/22");

        Scanner sccity = new Scanner(System.in);
        System.out.println("Enter the name of the city you want to travel.");
        destination.setName(sccity.nextLine());
        System.out.println("Enter the distance from Buenos Aires to destination in kilometers.");
        Scanner scdistance = new Scanner(System.in);
        destination.setDistanceFromBuenosAires(scdistance.nextInt());

        Ticket ticket1 = new Ticket(100, 1, destination.getDistanceFromBuenosAires());
        SalesPerson salesPerson = new SalesPerson(10, "Men", 151512, "Tutuca", 15, 220, "Aerolineas Argentinas");
        //System.out.println(ticket1.getTicketPrice()); /* Calculate the price of the ticket based in the distance from Buenos Aires*/

        LOGGER.error("Price of your flight:");
        try {
            LOGGER.error(ticket1.getTicketPrice() + " USD");
        } catch (IncorrectKilometersException e) {
            LOGGER.error(e);
        } catch (InputMismatchException e) {
            throw new NotANumberException(e);
        }
        try {
            LOGGER.error(plane1.getPassenger(124578, plane1.getPassengers()));
        } catch (PassengerNotFoundException e){
            LOGGER.error(e);
        }
        }
}

