package com.practices.arrays;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        int[][] numbers = new int[6][6];
        Scanner sc = new Scanner(System.in);

        for(int i=0 ; i<6 ; i++){
            for(int j=0 ; j<6 ; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        int max = -100;
        for(int i=1 ; i<5 ; i++){
            for(int j=1 ; j<5 ; j++){
                int sum = numbers[i-1][j-1] + numbers[i-1][j] + numbers[i-1][j+1]
                        + numbers[i][j]
                        +numbers[i+1][j-1] + numbers[i+1][j] + numbers[i+1][j+1];
                max = Math.max(sum, max);
            }
        }
        System.out.println(max);
    }

}
