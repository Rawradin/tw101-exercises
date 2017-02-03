package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by edgargonzalez on 2/2/17.
 */
public class GuessingGame {
    private final int targetNumber;

    public GuessingGame(int start, int end) {
        this.targetNumber = RandomNumber.between(start, end);
        System.out.println("  | Guessing Game |  \nEnter a number between " + start + " - " + end);
    }


    public Boolean guess(Scanner input) {
        String inputString = input.nextLine();
        int inputNumber = Integer.parseInt(inputString);

        if (inputNumber < this.targetNumber) {
            System.out.println("Your number is lower than target.");
        } else if (inputNumber > this.targetNumber) {
            System.out.println("Your number is higher than target.");
        } else {
            System.out.println("YES! You guess the number!");
            return true;
        }
        return false;
    }
}
