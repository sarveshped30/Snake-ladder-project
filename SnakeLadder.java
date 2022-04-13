// Author: Sarvesh Suryakant Pednekar
// Assignment: Snake and ladder game with 2 players

package com.bridgeLabz.snakeLadder;

import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args) {
        int player1 = 0;        // player1 position starts with 0
        int player2 = 0;        // player2 position starts with 0
        int dice1 = 0;          // Number of times player1 rolled dice
        int dice2 = 0;          // Number of times player2 rolled dice

        Random rand = new Random();

        // Iterating program till player1 or player2 reaches 100
        while(player1 != 100 && player2 != 100) {
            // Player1 playing......
            int roll1 = rand.nextInt(6);        // rolling die with random function
            int dieRoll1 = roll1 + 1;
            dice1++;     // counting die roll for player1

            System.out.println("Player1 rolling the dice.....");
            System.out.println("Player1 Got " + dieRoll1);      // Printing dice value

            int option1 = rand.nextInt(3);      // Choosing options with random function

            // Checking options with switch case
            switch(option1) {
                case 0:
                    System.out.println("Player1: No play.....");
                    break;
                case 1:
                    // Iterates program till option1 remains 1
                    while(option1 == 1) {
                        System.out.println("Player1: Got Ladder.....");
                        player1 += dieRoll1;        //Advancing in game

                        //if player1 goes beyond 100, it will return to previous value
                        if(player1 > 100) {
                            player1 -= dieRoll1;
                        }

                        option1 = rand.nextInt(3);      //Re-choosing options with random function

                        //Checking the option if 1 then playing again
                        if(option1 == 1) {
                            roll1 = rand.nextInt(6);        //Rolling dice with random function
                            dieRoll1 = roll1 + 1;

                            System.out.println("Player1 rolling dice again.....");
                            System.out.println("Player1 got " + dieRoll1);

                            dice1++;        //Counting die roll for player1
                        }
                    }
                    break;
                default:
                    System.out.println("Player1: oops! Got eaten by snake.....");
                    player1 -= dieRoll1;        //Decrementing by Dice number
            }

            //if player1 goes below zero than re-initiating to zero
            if(player1 < 0) {
                player1 = 0;
            }

            //Printing current position of player1
            System.out.println("Player1 Current position : " + player1);

            // Checking if player1 haven't reached 100 yet then player2 playing......
            if(player1 != 100) {
                int roll2 = rand.nextInt(6);        // Rolling die with random function
                int dieRoll2 = roll2 + 1;
                dice2++;        //Counting die roll for player2

                System.out.println("Player2 rolling the dice.....");
                System.out.println("Player2 Got " + dieRoll2);      //Printing dice value

                int option2 = rand.nextInt(3);      // Checking options with random function

                switch (option2) {
                    case 0:
                        System.out.println("Player2: No play.....");
                        break;
                    case 1:
                        while(option2 == 1) {
                            System.out.println("Player2: Got Ladder.....");
                            player2 += dieRoll2;        //Advancing in game

                            //if player2 goes beyond 100, it will return to previous value
                            if (player2 > 100) {
                                player2 -= dieRoll2;
                            }

                            option2 = rand.nextInt(3);      //Re-choosing options with random function

                            // if option2 is still 1 then player2 playing again
                            if(option2 == 1) {
                                roll2 = rand.nextInt(6);        //Rolling dice with random function
                                dieRoll2 = roll2 + 1;

                                System.out.println("Player2 rolling dice again.....");
                                System.out.println("Player2 got " + dieRoll2);      //Printing dice value

                                dice2++;        //Counting die roll for player1
                            }
                        }
                        break;
                    default:
                        System.out.println("Player2: oops! Got eaten by snake.....");
                        player2 -= dieRoll2;        //Decrementing by Dice number
                }

                //if player1 goes below zero than re-initializing to zero
                if (player2 < 0) {
                    player2 = 0;
                }

                //Printing current position of player2
                System.out.println("Player2 Current position : " + player2);
            }
        }

        // if else condition to check who won the game
        if(player1 > player2) {
            System.out.println("Congratulations Player1 Won the game.....");
            System.out.println("Player1 rolled dice " + dice1 + " times to win");
            System.out.println("Player2 rolled dice " + dice2 + " times");
        } else {
            System.out.println("Congratulations Player2 Won the game.....");
            System.out.println("Player2 rolled dice " + dice2 + " times to win");
            System.out.println("Player1 rolled dice " + dice1 + " times");
        }
    }
}
