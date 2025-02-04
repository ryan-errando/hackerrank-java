package com.practices.sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i=0 ; i<n ; i++){
            numbers[i] = sc.nextInt();
        }

        int swap = 0;
        for (int i=0 ; i<n ; i++){
            for(int j=0 ; j<n-1 ; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swap++;
                }
            }
        }
        System.out.println("Array is sorted in " + swap + " swaps.");
        System.out.println("First Element: " + numbers[0]);
        System.out.println("Last Element: " + numbers[n-1]);
    }

}
