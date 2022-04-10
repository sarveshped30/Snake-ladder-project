package com.bridgeLabz.snakeLadder;

import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args) {
        int player1 = 0; // player1 position starts with 0

        Random rand = new Random();

        while(player1 != 100) {
            int roll = rand.nextInt(6);      // initializing die with random function
            int dieRoll = roll + 1;
            int option = rand.nextInt(3);       // initializing option with random function

            System.out.println("Player rolling the die.....");
            System.out.println("Got " + dieRoll);

            switch(option) {
                case 0:
                    System.out.println("No play.....");
                    break;
                case 1:
                    System.out.println("Got Ladder.....");
                    player1 += dieRoll;
                    if(player1 > 100) {
                        player1 -= dieRoll;
                    }
                    break;
                default:
                    System.out.println("oops! Got eaten by snake.....");
                    player1 -= dieRoll;
            }

            if(player1 < 0) {
                player1 = 0;
            }
        }
        System.out.println("Congratulations you reached " + player1 + " you Won the game.........");
    }
}
