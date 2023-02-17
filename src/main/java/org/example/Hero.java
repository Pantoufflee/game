package org.example;

public class Hero {
    int healthPoints;
    final int attackPoints;
    final int id;

    Hero(int attackPoints, int id) {
        this.healthPoints = 100;
        this.attackPoints = attackPoints;
        this.id = id;
    }
    @Override
    public String toString() {
        return "hero № "+ id + ", Health points " + healthPoints + ", attack points " + attackPoints;
    }
}
