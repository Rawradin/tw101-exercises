package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
//        drawADiamond(100);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int width = (2 * n) - 1;

        for (int i = 0; i < n; i++) {
            calcAndPrintLine(i, width);
        }
    }

    //    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        int width = (2 * n) - 1;

        for (int i = 0; i < n; i++) {
            calcAndPrintLine(i, width);
        }
        for (int i = n-2; i >= 0; i--) {
            calcAndPrintLine(i, width);
        }
    }

    //    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int width = (2 * n) - 1;

        for (int i = 0; i < n-1; i++) {
            calcAndPrintLine(i, width);
        }
        System.out.println("Edgar");
        for (int i = n-2; i >= 0; i--) {
            calcAndPrintLine(i, width);
        }
    }

    private static void printNTimes(int n, String str) {
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }

    private static void calcAndPrintLine(int i, int width) {
        int emptySpaces = (width - (2 * i) - 1) / 2;
        int stars  = width - (2 * emptySpaces);

        printNTimes(emptySpaces, " ");
        printNTimes(stars, "*");
        printNTimes(emptySpaces, " ");
        System.out.print("\n");
    }
}

