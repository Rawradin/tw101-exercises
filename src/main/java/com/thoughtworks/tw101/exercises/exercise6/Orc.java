package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by edgargonzalez on 2/1/17.
 */
public class Orc implements Monster {
    private String name = "Orc";
    private int hp = 20;

    @Override
    public void takeDamage(int damage) {
        this.hp -= damage;
    }

    @Override
    public void reportStatus() {
        System.out.println(this.name + " has " + this.hp + " hp left.");
    }
}
