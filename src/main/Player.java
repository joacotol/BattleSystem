package main;

public class Player {

    private String name;
    private double health;
    private double attack;

    public Player() {
        this("John Doe", 10.0, 2.0);
    }

    public Player(String name, double health, double attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public double getHealth() {
        return this.health;
    }

    public double getAttack() {
        return this.attack;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " | Health: " + getHealth() + " | Attack: " + getAttack();
    }
}
