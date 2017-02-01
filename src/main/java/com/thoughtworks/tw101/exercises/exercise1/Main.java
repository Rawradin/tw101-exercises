package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int sum = printOddsAndReturnSum(1,100);

        System.out.println("Sum is of previous odd numbers is " + sum);
    }

    private static int printOddsAndReturnSum(int startInt, int endInt) {
        int sum = 0;
        for(int i = startInt; i <= endInt; i++){
            if(i % 2 == 1) {
                sum += i;
                System.out.println(i);
            }
        }
        return sum;
    }
}
