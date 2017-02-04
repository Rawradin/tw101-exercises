package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(2668);
        for (int prime : primeFactors) {
            System.out.println(prime);
        }
    }

    private static List<Integer> generate(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                factors.add(i);
            }
        }

        for (int factor : factors) {
            if(isPrime(factor)) {
                primes.add(factor);
            }
        }
        return primes;
    }

    private static boolean isPrime(int n) {
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
