package com.thoughtworks.tw101.exercises.exercise8;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by edgargonzalez on 2/2/17.
 */
public class GuessingGame {
    private final int targetNumber;
    private final int start;
    private final int end;
    private ArrayList<Integer> guesses = new ArrayList<>();

    public GuessingGame(int start, int end) {
        this.start = start;
        this.end = end;
        this.targetNumber = RandomNumber.between(start, end);
        System.out.println("  | Guessing Games |  \nEnter a number between " + start + " - " + end);
    }


    public Boolean guess(Scanner input) {
        String inputString = input.nextLine();
        try {
            int inputNumber = Integer.parseInt(inputString);

            if (inputNumber < this.start || inputNumber > this.end) throw new OutOfBoundsException();

            guesses.add(inputNumber);

            if (inputNumber < this.targetNumber) {
                System.out.println("Your number is LOWER than target.");
            } else if (inputNumber > this.targetNumber) {
                System.out.println("Your number is HIGHER than target.");
            } else {
                System.out.println("YES! You guessed the number!");
                return true;
            }
            return false;
        } catch (NumberFormatException err) {
            System.out.println("You must enter a valid integer!");
            return false;
        } catch (OutOfBoundsException err) { //thinking about it. This might be unnecessary
            System.out.println("You must within the bounds of the guessing game.");
            return false;
        }

    }

    public void printGuesses() {
        System.out.print("\nGuesses: ");
        for(int guess : this.guesses) {
            System.out.print(guess + " ");
        }
    }
}