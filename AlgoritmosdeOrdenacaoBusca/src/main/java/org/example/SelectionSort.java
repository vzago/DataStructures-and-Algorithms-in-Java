package org.example;

public class SelectionSort {
    private int[] array;

    SelectionSort(int size){
        array = new int[size];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static void selectionSort(int[] array){
        int smallest_number_index,temp;
        for(int i = 0; i < array.length; i++){
            smallest_number_index = i ;
            for(int j = i+1; j < array.length;j++){
                if(array[j] < array[smallest_number_index]){
                    smallest_number_index = j;
                }
            }
            temp = array[smallest_number_index];
            array[smallest_number_index] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args){
        SelectionSort ss = new SelectionSort(100);
        System.out.println("Array Before Sorting");

        for(int num : ss.array){
            System.out.print(num+" ");
        }

        selectionSort(ss.array);

        System.out.println("\nArray After Sorting");

        for(int num: ss.array){
            System.out.print(num+ " ");
        }
    }
}
