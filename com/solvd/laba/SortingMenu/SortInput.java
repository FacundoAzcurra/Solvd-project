package com.solvd.laba.SortingMenu;

import java.util.Arrays;
import java.util.Scanner;


public class SortInput {
    public static void main(String[] args) {
        int array;
        SortMethods sortMethods = new SortMethods();
        ArrayInput arrayInput = new ArrayInput();

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Select sort method.");
            System.out.println("1-Ascending Numbers.");
            System.out.println("2-Descending Numbers.");
            System.out.println("3-Letters from A-Z.");
            System.out.println("4-Letters from Z-A.");
            System.out.println("5-Close program.");
            array = sc.nextInt();

            switch (array) {
                case 1:
                    arrayInput.printArray(sortMethods.SortingAsc(arrayInput.enterNumbers()));
                    break;
                case 2:
                    arrayInput.printArray(sortMethods.SortingDesc(arrayInput.enterNumbers()));
                    break;
                case 3:
                    System.out.println(Arrays.toString(sortMethods.SortingAZ(arrayInput.enterLetters())));
                    break;
                case 4:
                    System.out.println(Arrays.toString(sortMethods.SortingZA(arrayInput.enterLetters())));
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    array = 0;
                    break;

                default:
                    System.out.println("Not a valid option.");
            }
            System.out.println(" ");
            System.out.println(" ");
        } while (array != 0);
    }
}
