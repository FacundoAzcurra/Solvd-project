package com.solvd.airportpackage;

import com.solvd.airportpackage.persons.Passenger;
import com.solvd.airportpackage.persons.SalesPerson;

import java.util.Scanner;

public class Airport {
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger(20, "Male", 1578475, "Facundo Azcurra");
        System.out.println("Enter the name of the passenger");
        Scanner scPassengerName = new Scanner(System.in);
        passenger1.setName(scPassengerName.next());

        System.out.println("Hello " + passenger1.getName());

        Plane plane1 = new Plane(1, "boeing", "tutuca", 2020);
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
        System.out.println("Price of your flight:");
        System.out.println(ticket1.getTicketPrice());
    }
}
