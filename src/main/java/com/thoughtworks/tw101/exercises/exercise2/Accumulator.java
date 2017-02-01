package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int count;

    public void increment() {
        this.count++;
    }

    public int total() {
        return this.count;
    }
}
