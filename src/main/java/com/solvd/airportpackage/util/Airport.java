package com.solvd.airportpackage.util;

import com.solvd.airportpackage.model.Destination;
import com.solvd.airportpackage.model.Flight;
import com.solvd.airportpackage.model.Plane;
import com.solvd.airportpackage.model.Ticket;
import com.solvd.airportpackage.model.constant.PlaneColors;
import com.solvd.airportpackage.model.constant.PlaneSize;
import com.solvd.airportpackage.model.exception.IncorrectKilometersException;
import com.solvd.airportpackage.model.exception.NotANumberException;
import com.solvd.airportpackage.model.exception.PassengerNotFoundException;
import com.solvd.airportpackage.model.generic.CompareObjectField;
import com.solvd.airportpackage.model.generic.PrintDataGeneric;
import com.solvd.airportpackage.model.generic.PrintObjectToString;
import com.solvd.airportpackage.model.interface1.Discounter;
import com.solvd.airportpackage.model.interface1.IFly;
import com.solvd.airportpackage.model.interface1.ITicketable;
import com.solvd.airportpackage.model.person.FlightAttendant;
import com.solvd.airportpackage.model.person.Passenger;
import com.solvd.airportpackage.model.person.SalesPerson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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
        Random random = new Random();
        Plane plane1 = new Plane(1, "boeing", "tutuca", 2020, PlaneColors.BLUE, PlaneSize.MIDPLANE);

        /* trying to figure how to use enums
        LOGGER.info(plane1.getColor());*/

        LOGGER.info("Plane 1 Passengers: ");

        plane1.addPassenger(passenger1);
        plane1.addPassenger(passenger2);
        plane1.addPassenger(passenger3);
        plane1.addPassenger(passenger4);
        //stream printer of passenger arraylist.
        plane1.getPassengers().stream().forEach(LOGGER::info);


        Destination destination = new Destination("Belarus", true, 10, "Europe", 12807);
        Flight flight1 = new Flight("AR1", destination, "22:15-3/16/22");

        //IChoose interface usage.
        passenger1.chooseDestination();

        Scanner sccity = new Scanner(System.in);
        LOGGER.info("Enter the name of the city you want to travel.");
        destination.setName(sccity.nextLine());
        LOGGER.info("Enter the distance from Buenos Aires to destination in kilometers.");
        Scanner scdistance = new Scanner(System.in);
        destination.setDistanceFromBuenosAires(scdistance.nextInt());

        //LOGGER.info(ticket1.getTicketPrice()); /* Calculate the price of the ticket based in the distance from Buenos Aires*/
        LOGGER.info("Select the desired plane colour");
        Scanner scplanecolour = new Scanner(System.in);

        LOGGER.info("--1- BLUE // 2- WHITE // 3-RED--");

        int planeCol;
        planeCol = scplanecolour.nextInt();

        switch (planeCol) {
            case 1:
                LOGGER.info("You selected blue!");
                plane1.setColor(PlaneColors.BLUE);
                break;
            case 2:
                LOGGER.info("You selected white!");
                plane1.setColor(PlaneColors.WHITE);
                break;
            case 3:
                LOGGER.info("You selected red!");
                plane1.setColor(PlaneColors.RED);
                break;
            default:
                LOGGER.info("Select an available colour");
        }


        ITicketable createRandomTicket = () ->
        {
            Random random1 = new Random();
            int Ticketid = random1.nextInt(4000);
            int document = random1.nextInt(4000);
            int passenger = random1.nextInt(plane1.getPassengers().size());
            Ticket randomCreatedTicket = new Ticket(Ticketid, document, destination.getDistanceFromBuenosAires(), plane1.getPassengers().get(passenger));
            return randomCreatedTicket;
        };
        boolean booleanRandom = ThreadLocalRandom.current().nextBoolean();
        LOGGER.info("Plane is on time: " + booleanRandom);


        Ticket ticket1 = createRandomTicket.createRandomTicket();
        LOGGER.info("TICKET;" + ticket1);
        LOGGER.info(ticket1.getOwner());


        SalesPerson salesMan1 = new SalesPerson(18, "Male", random.nextInt(4000000), "Juan Adalberto", random.nextInt(1000), 50, "Aerolineas Argentinas", random.nextInt());
        //SalesPerson class implements ISell, to sell you a random ticket id, that it will store in the buyerId
        salesMan1.sell(random.nextInt(4000));
        LOGGER.info(salesMan1.getAirline());
        salesMan1.sell(123);
        salesMan1.seller();
        LOGGER.info("Here is your ticket!");

        LOGGER.info("Here is the list of the available procedures. \n 1. Passenger Data Comparer \n 2. Passenger data consultant \n 3. Message printer \n Please select a number between 1-3:");


        Scanner scmenuselector = new Scanner(System.in);

        switch (scmenuselector.nextInt()) {
            case 1:
                CompareObjectField comparer = new CompareObjectField();
                comparer.compareField(passenger1, passenger2, "name");
                break;
            case 2:
                PrintObjectToString printer1 = new PrintObjectToString();
                printer1.print(plane1.toString());
                break;
            case 3:
                PrintDataGeneric messagePrinter = new PrintDataGeneric();
                messagePrinter.setData("Welcome onboard Argentinian Airlines, hope you have a good flight!");
                messagePrinter.ShowElement();
                break;
            default:
                LOGGER.info("Please a enter valid option, you entered: " + scmenuselector.nextInt());
        }
        FlightAttendant flightAttendant1 = new FlightAttendant(28, "Male", 666, "Manuelito", 2555, 5, true, new String[]{"ESPANOL,INGLES"});
        PrintObjectToString printer = new PrintObjectToString();
        printer.print(flightAttendant1.toString());
        //IAttend interface usage
        flightAttendant1.attend();
        //IAttend interface usage
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

        LOGGER.info("Hi im " + salesMan1.getName() + " The price of your ticket is: " + ticket1.getTicketPrice() + "\n If you pay in cash you have a 10% discount on your ticket price. \n Which payment method you wanna use? \n 1. Credit card \n 2. Cash");
        Scanner paymentMethod = new Scanner(System.in);

        switch (paymentMethod.nextInt()) {
            case 1:
                passenger1.pay();
                LOGGER.info("The transaction was successfully, enjoy your flight!");
                break;
            case 2:
                Discounter discounter = (ticketprice, discount) -> {
                    LOGGER.info("The total by paying in cash is: " + "\n" + (ticketprice * (100 - discount) / 100));
                };
                discounter.discount(ticket1.getTicketPrice(), 10);
                passenger1.pay();
                LOGGER.info("The transaction was successfully, enjoy your flight!");
                break;
            default:
                LOGGER.info("Please a enter valid option, you entered: " + paymentMethod.nextInt());
        }
        IFly flyable = () -> {
            LOGGER.info("Plane take off starting...");
            plane1.toString();
        };
        flyable.fly();
    }
}