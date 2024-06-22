package com.codsoftintern;
import java.util.Random;
import java.util.Scanner;
public class NumberGame {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            boolean playGameAgain = true;
            int score = 0;

            //until the condition is true while we repeated
            while (playGameAgain) {
                int numberToGuess = random.nextInt(100) + 1;
                int numberOfAttempts = 0;
                boolean CorrectGuessing = false;
                int maximumAttempts = 10;

                System.out.println("Hey I have generated a number between 1 and 100. Can you able to guess it?");

                while (!CorrectGuessing && numberOfAttempts < maximumAttempts) {
                    System.out.print("Enter your guess here : ");
                    int userGuessing = sc.nextInt();
                    numberOfAttempts++;

                    if (userGuessing == numberToGuess) {
                        CorrectGuessing = true;
                        System.out.println("Congratulations! You Have guessed the Correct Number.");
                        score++;
                    } else if (userGuessing < numberToGuess) {
                        System.out.println("Too low! Please Try again.");
                    } else {
                        System.out.println("Too high! Please Try again.");
                    }
                }

                if (!CorrectGuessing) {
                    System.out.println("Sorry, all your attempts are Used. The number was: " + numberToGuess);
                }

                System.out.print("Do you want to play again? then write (yes/no): ");
                String response = sc.next();

                if (!response.equalsIgnoreCase("yes")) {
                    playGameAgain = false;
                }
            }

            System.out.println("Game over! Your score is: " + score);
            sc.close();
        }
    }

