package org.example;

public class QuickSort {
    private int[] array;

    public QuickSort(int size) {
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = partition(array, left, right);
            quickSort(array,left,pivot);
            quickSort(array,pivot+1,right);
        }
    }

    static int partition(int[] array, int left, int right) {
        int middle = (int) (left + right) / 2;
        int pivot = array[middle];
        int i = left - 1;
        int j = right + 1;
        while (true) {
            do {
                i++;
            } while (array[i] < pivot);
            do {
                j--;
            } while (array[j] > pivot);
            if (i >= j){
                return j;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort(10);
        System.out.println("Array Before Sorting");

        for(int num: qs.array){
            System.out.print(num+" ");
        }

        quickSort(qs.array,0,qs.array.length-1);
        System.out.println("\n\nArray After Sorting");
        for(int num: qs.array){
            System.out.print(num+ " ");
        }
    }
}