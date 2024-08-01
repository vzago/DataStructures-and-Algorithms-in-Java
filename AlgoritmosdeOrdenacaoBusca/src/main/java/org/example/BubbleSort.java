package org.example;

public class BubbleSort {
    private int[] array;

    public BubbleSort(int size) {
        array = new int[size]; // Initialize the array with the specified size
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100); // Generate random numbers between 0 and 99
        }
    }

    public static void bubbleSort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swap occurred in the current iteration, the array is sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort(10); // Create an instance with an array of 10 elements
        System.out.println("Array before sorting:");
        for (int num : bs.array) {
            System.out.print(num + " ");
        }

        bubbleSort(bs.array); // Sort the array

        System.out.println("\nArray after sorting:");
        for (int num : bs.array) {
            System.out.print(num + " ");
        }
    }
}
