package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;

/**
 * Created by edgargonzalez on 2/2/17.
 */
public class RandomNumber {
    public static int between(int a, int b) {
        Random randy = new Random();
        return randy.nextInt(b-a) + a;
    }
}
