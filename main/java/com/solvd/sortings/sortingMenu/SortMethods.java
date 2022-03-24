package com.solvd.sortings.sortingMenu;

public class SortMethods {
    public int[] SortingAsc(int[] arr) {
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1; i++)
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
        }
        return arr;
    }

    public int[] SortingDesc(int[] arr) {
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1; i++)
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
        }
        return arr;
    }

    public char[] SortingAZ(char[] arr) {
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1; i++)
                if (arr[i] > arr[i + 1]) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
        }
        return arr;
    }

    public char[] SortingZA(char[] arr) {
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1; i++)
                if (arr[i] < arr[i + 1]) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
        }
        return arr;
    }
}

