package com.bridgeLabz.snakeLadder;

import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args) {
        int player1 = 0; // player1 position starts with 0

        Random rand = new Random();
        int dieRoll = rand.nextInt(7);      // initializing die with random function
        int option = rand.nextInt(3);

        System.out.println("Player rolling the die.....");
        System.out.println("Got " + dieRoll);

        switch(option) {
            case 0:
                System.out.println("No play.....");
                break;
            case 1:
                System.out.println("Got Ladder.....");
                player1 += dieRoll;
            default:
                System.out.println("oops! Got eaten by snake.....");
                player1 -= dieRoll;
        }
    }
}
