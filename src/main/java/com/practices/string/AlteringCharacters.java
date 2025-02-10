package com.practices.string;

import java.util.Scanner;

public class AlteringCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0 ; i<n ; i++){
            String str = sc.nextLine();

            int count = 0;
            for(int j=0 ; j<str.length()-1 ; j++){
                if(str.charAt(j) == str.charAt(j+1)){
                    count++;
                }
            }

            System.out.println(count);
        }
    }

}
