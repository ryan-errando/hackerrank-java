package com.practices.arrays;

import java.util.Scanner;

public class NewYearChaos {

    static void minBribes(int[] numbers,  int n){
        int swap = 0;
        for(int j=n-1 ; j>=0 ; j--){
            if(numbers[j] != j+1){
                if(j-1 >= 0 && numbers[j-1] == j+1){
                    int temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                    swap++;
                }
                else if(j-2 >= 0 && numbers[j-2] == j+1){
                    int temp = numbers[j-2];
                    numbers[j-2] = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                    swap+=2;
                }
                else{
                    System.out.println("Too chaotic");
                    break;
                }
            }
        }
        System.out.println(swap);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=0 ; i<t ; i++){
            int n = sc.nextInt();
            int[] numbers = new int[n];

            //input array value
            for(int j=0 ; j<n ; j++){
                numbers[j] = sc.nextInt();
            }

            minBribes(numbers, n);
        }
    }

}
