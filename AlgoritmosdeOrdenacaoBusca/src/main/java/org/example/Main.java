package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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