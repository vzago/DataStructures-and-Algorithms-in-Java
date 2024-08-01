package org.example;

import java.util.Scanner;
//The array must be sorted to use Binary Search;
//We will start at the middle position in the array, and we will
//check if the number we are searching for is greater or less than
//half of the array
//The complexity of the BS is O(1) in the best case, which is when the target_number is in the middle of the array
//And in the Average Case is O(logn)

public class BinarySearch {
    private int[] array;

    // Constructor to initialize the array
    public BinarySearch() {
        array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
    }

    // Method to display the array
    public void displayArray() {
        for (int value : array) {
            System.out.println(value);
        }
    }

    // Method to perform binary search
    public boolean search(int targetNumber) {
        int start = 0;
        int end = array.length - 1;
        int middle;

        while (start <= end) {
            middle = (start + end) / 2;
            if (array[middle] == targetNumber) {
                return true; // Number found
            } else if (array[middle] < targetNumber) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return false; // Number not found
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.displayArray();

        System.out.println("Which number are you trying to find?");
        Scanner scanner = new Scanner(System.in);
        int targetNumber = scanner.nextInt();

        boolean found = binarySearch.search(targetNumber);
        if (found) {
            System.out.println("Number found!");
        } else {
            System.out.println("Number not found.");
        }

        scanner.close();
    }
}
