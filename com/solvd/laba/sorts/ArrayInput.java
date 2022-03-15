package com.solvd.laba.sorts;

import java.util.Scanner;

public class ArrayInput {
    private final Scanner scanner = new Scanner(System.in);

    public int[] enterNumbers() {
        System.out.println("Enter desired numbers with - ");
        String userInput = scanner.next();
        String[] splitArray = userInput.split("-");

        int[] numbers = new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            numbers[i] = Integer.parseInt(splitArray[i]);
        }
        return numbers;
    }

    public char[] enterLetters() {
        System.out.println("Enter desired letters");
        String userInput = scanner.next();
        return userInput.toCharArray();
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

