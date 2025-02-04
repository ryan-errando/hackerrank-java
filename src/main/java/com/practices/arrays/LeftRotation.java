package com.practices.arrays;

import java.util.Scanner;

public class LeftRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] numbers = new int[n];

        for(int i=0 ; i<n ; i++){
            numbers[i] = sc.nextInt();
        }

        int idx = d;
        int count = 0;
        do{
            if(idx == n){
                idx = 0;
            }
            System.out.printf("%d ", numbers[idx]);
            count++;
            idx++;
        }while(count != n);
    }

}
