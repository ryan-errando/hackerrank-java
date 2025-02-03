package com.practices.arrays;

import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] numbers = new long[n+1];

        for(int i=0 ; i<m ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            long k = sc.nextInt();

            numbers[a-1] += k;
            numbers[b] -= k;
        }

        long sum = 0;
        long max = 0;
        for(int i=0 ; i<n ; i++){
            sum+=numbers[i];
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }

}
