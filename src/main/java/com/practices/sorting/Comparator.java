package com.practices.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Comparator {

    static class Player{
        String name;
        int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return String.format("%s %d", name, score);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0 ; i<n ; i++){
            players.add(new Player(sc.next(), sc.nextInt()));
        }

        players.sort((p1, p2) ->
        {
            if (p1.score != p2.score) {
                return p2.score - p1.score;
            } else {
                return p1.name.compareTo(p2.name);
            }
        });

        for(Player show : players){
            System.out.println(show);
        }
    }
}
