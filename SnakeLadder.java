package com.bridgeLabz.snakeLadder;

import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args) {
        int player1 = 0; // player1 position starts with 0
        int player2 = 0;
        int dice = 0;

        Random rand = new Random();

        while(player1 != 100 && player2 != 100) {
            int roll1 = rand.nextInt(6);      // initializing die with random function
            int dieRoll1 = roll1 + 1;
            int roll2 = rand.nextInt(6);      // initializing die with random function
            int dieRoll2 = roll2 + 1;
            int option1 = rand.nextInt(3);       // initializing option with random function
            int option2 = rand.nextInt(3);
            dice++;

            // Player1 playing......
            System.out.println("Player1 rolling the die.....");
            System.out.println("Player1 Got " + dieRoll1);

            switch(option1) {
                case 0:
                    System.out.println("Player1: No play.....");
                    break;
                case 1:
                    System.out.println("Player1: Got Ladder.....");
                    player1 += dieRoll1;
                    if(player1 > 100) {
                        player1 -= dieRoll1;
                    }
                    break;
                default:
                    System.out.println("Player1: oops! Got eaten by snake.....");
                    player1 -= dieRoll1;
            }

            if(player1 < 0) {
                player1 = 0;
            }

            System.out.println("Player1 Current position : " + player1);

            // player2 playing......
            if(player1 != 100) {
                System.out.println("Player2 rolling the die.....");
                System.out.println("Player2 Got " + dieRoll2);

                switch (option2) {
                    case 0:
                        System.out.println("Player2: No play.....");
                        break;
                    case 1:
                        System.out.println("Player2: Got Ladder.....");
                        player2 += dieRoll2;
                        if (player2 > 100) {
                            player2 -= dieRoll2;
                        }
                        break;
                    default:
                        System.out.println("Player2: oops! Got eaten by snake.....");
                        player2 -= dieRoll2;
                }

                if (player2 < 0) {
                    player2 = 0;
                }

                System.out.println("Player2 Current position : " + player2);
            }
        }

        if(player1 > player2) {
            System.out.println("Congratulations Player1 Won the game.....");
            System.out.println("Player1 rolled dice " + dice + " times to win");
        } else {
            System.out.println("Congratulations Player2 Won the game.....");
            System.out.println("Player2 rolled dice " + dice + " times to win");
        }
    }
}
