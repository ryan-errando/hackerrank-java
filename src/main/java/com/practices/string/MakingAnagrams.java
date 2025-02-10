package com.practices.string;

import java.util.Scanner;

public class MakingAnagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[26];
        String a = sc.nextLine();
        String b = sc.nextLine();

        for(int i=0 ; i<a.length() ; i++){
            count[a.charAt(i) - 'a']++;
        }

        for(int i=0 ; i<b.length() ; i++){
            count[b.charAt(i) - 'a']--;
        }

        int sum = 0;
        for(int i=0 ; i<26 ; i++){
            sum += Math.abs(count[i]);
        }

        System.out.println(sum);
    }

}
