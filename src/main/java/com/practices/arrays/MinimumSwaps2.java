package com.practices.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class MinimumSwaps2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] numbers = new int[n];
        int swap = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0 ; i<n ; i++){
            numbers[i] = sc.nextInt();
            map.put(numbers[i], i);
        }

        for(int i=0 ; i<n ; i++){
            if(numbers[i] != i+1){
                int idx = map.get(i+1);
                map.put(numbers[i],idx);
                map.put(i+1, i);

                int temp = numbers[i];
                numbers[i] = numbers[idx];
                numbers[idx] = temp;

                swap++;
            }
        }

        System.out.println(swap);
    }

}
