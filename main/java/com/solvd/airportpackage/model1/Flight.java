package com.solvd.airportpackage.model1;

public class Flight {
    private String flightId;
    private Destination arrival;
    private String timeAndDay;

    public Flight(String flightId, Destination arrival, String timeAndDay) {
        this.flightId = flightId;
        this.arrival = arrival;
        this.timeAndDay = timeAndDay;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public Destination getArrival() {
        return arrival;
    }

    public void setArrival(Destination arrival) {
        this.arrival = arrival;
    }

    public String getTimeAndDay() {
        return timeAndDay;
    }

    public void setTimeAndDay(String timeAndDay) {
        this.timeAndDay = timeAndDay;
    }

    @Override
    public String toString() {
        return "flight" +
                " with flight id number " + flightId +
                " arriving in " + arrival + " arrived " +
                "at date " + timeAndDay;
    }

}
