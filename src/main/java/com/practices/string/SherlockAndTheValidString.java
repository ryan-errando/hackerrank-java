package com.practices.string;

import java.util.Scanner;

public class SherlockAndTheValidString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[26];
        String str = sc.nextLine();

        for(int i=0 ; i<str.length() ; i++){
            count[str.charAt(i) - 'a']++;
        }



    }

}
