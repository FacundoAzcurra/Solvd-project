package com.solvd.airportpackage.model.person;


import com.solvd.airportpackage.model.interface1.ISell;

public class SalesPerson extends Employee implements ISell {
    private final int soldTickets;
    private String airline;

    public SalesPerson(int age, String sex, int document, String name, int employeeId, double wage, int soldTickets) {
        super(age, sex, document, name, employeeId, wage);
        this.soldTickets = soldTickets;
    }

    public SalesPerson(int age, String sex, int document, String name, int employeeId, double wage, String airline,int soldTickets) {
        super(age, sex, document, name, employeeId, wage);
        this.airline = airline;
        this.soldTickets = soldTickets;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        airline = airline;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "airline='" + airline + '\'' +
                "} " + super.toString();
    }


    public void sell(int soldTickets) {}
    public void seller(){
        System.out.println("SalesMan: Im selling tickets. \n SalesMan: Where do you wanna go next?");
    }
    @Override
    public String SellingTickets() {
        String TicketsSold;
        return null;
    }

}
