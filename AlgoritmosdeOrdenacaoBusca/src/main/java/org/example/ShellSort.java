package org.example;

public class ShellSort {
    private int[] array;

    public ShellSort(int size){
        array = new int[size];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*100);
        }
    }

    public static void shellSort(int[] array) {
        int h = 1;
        int n = array.length;
        while(h < n){
            h = h * 3 + 1;
        }
        h = (int) Math.floor(h/3); //round down one decimal place

        int element, j;
        while(h>0){
            for(int i = h; i < n; i++){
                element = array[i];
                j = i;
                while(j>=h && array[j - h] > element){
                    array[j] = array[j-h];
                    j = j-h;
                }
                array[j] = element;
            }
            h = h/2;
        }
    }

    public static void main(String[] args) {
        ShellSort shs = new ShellSort(10);
        System.out.println("Array Before Sorting");

        for(int num: shs.array){
            System.out.print(num+" ");
        }

        shellSort(shs.array);
        System.out.println("\n\nArray After Sorting");
        for(int num: shs.array){
            System.out.print(num+ " ");
        }
    }
}
