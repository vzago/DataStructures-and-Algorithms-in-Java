package org.example;

public class InsertionSort {
    private int[] array;

    public InsertionSort(int size){
        array = new int[size];
        for(int i = 0; i < array.length;i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static void insertionSort(int[] array){
        int temp,j;
        for(int i = 1; i < array.length;i++){
            temp = array[i];
            j = i-1;
            while(j>= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }

    public static void main(String[] args){
        InsertionSort is = new InsertionSort(100);
        System.out.println("Array Before Sorting");

        for(int num: is.array){
            System.out.print(num + " ");
        }

        insertionSort(is.array);
        System.out.println("\nAfter Sorting");
        for(int num: is.array){
            System.out.print(num + " ");
        }
    }
}
