package com.practices.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MarkAndToys {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            numbers.add(sc.nextInt());
        }

        Collections.sort(numbers);
        int count = 0;

        for(int price : numbers){
            if(k >= price){
                count++;
                k-=price;
            }
        }
        System.out.println(count);
    }

}
