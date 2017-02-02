package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by edgargonzalez on 2/1/17.
 */
public class Troll implements Monster {
    private String name = "Troll";
    private int hitpoints = 20;

    @Override
    public void takeDamage(int damage) {
        this.hitpoints -= (damage/2);
    }

    @Override
    public void reportStatus() {
        System.out.println(this.name + " has " + this.hitpoints + " hp left.");
    }
}
