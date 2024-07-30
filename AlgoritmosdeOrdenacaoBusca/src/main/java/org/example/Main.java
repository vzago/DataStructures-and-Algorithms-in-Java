package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//The array must be sorted to use Binary Search;
//We will start at the middle position in the array, and we will
//check if the number we are searching for is greater or less than
//half of the array
//The complexity of the BS is O(1) in the best case, which is when the target_number is in the middle of the array
//And in the Average Case is O(logn)
        int[] array  = new int[8];
        for(int i = 0; i < array.length; i++){
            array [i] = i*2;
            System.out.println(array[i]);
        }

        System.out.println("Which number are you trying to find ?");
        Scanner leitor = new Scanner(System.in);
        int target_number = leitor.nextInt();

        int count = 0; //It counts how many steps it takes to find the target_number
        boolean found = false;
        int start = 0;
        int end = array.length-1;
        int middle;

        while(start<=end){
            middle = (int)((start+end)/2);
            if(array[middle] == target_number){
                found = true;
                break;
            }else if(array[middle] < target_number){
                start = middle+1;
            }else{
                end = middle-1;
            }
        }
    }
}