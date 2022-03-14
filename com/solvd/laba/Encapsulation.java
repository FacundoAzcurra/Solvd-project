package com.solvd.laba;

public class Encapsulation {
    public static void main(String[] args) {

        Plane plane = new Plane("Boeing", "747", 2022, "blue", 74);


        plane.setMake("Boeing");
        plane.setModel("747");
        plane.setYear(2022);
        plane.setColour("blue");
        plane.setSeats(74);

        System.out.println("Make :");
        System.out.println(plane.getMake());
        System.out.println("Model :");
        System.out.println(plane.getModel());
        System.out.println("Year :");
        System.out.println(plane.getYear());
        System.out.println("Colour :");
        System.out.println(plane.getColour());
        System.out.println("Seats :");
        System.out.println(plane.getSeats());


    }
}
