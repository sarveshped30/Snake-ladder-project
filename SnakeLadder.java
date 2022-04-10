package com.bridgeLabz.snakeLadder;

import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args) {
        int player1 = 0; // player1 position starts with 0

        Random rand = new Random();
        int dieRoll = rand.nextInt(7);      // initializing die with random function

        System.out.println("Player rolling the die.....");
        System.out.println("Got " + dieRoll);
    }
}
