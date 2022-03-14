package com.solvd.laba;

import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {

Plane plane = new Plane ("Boeing", "747",2022 );

plane.setYear(2022);
plane.setMake("Boeing");
plane.setModel("747");

        System.out.println("Make :");
        System.out.println(plane.getMake());
        System.out.println("Model :");
        System.out.println(plane.getModel());
        System.out.println("Year :");
        System.out.println(plane.getYear());
    }
}
