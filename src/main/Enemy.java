package main;

public class Enemy {
    private String name;
    private double health;
    private double attack;

    public Enemy() {
        this("Slime", 5, 1.5);
    }

    public Enemy(String name, double health, double attack) {
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
        return "Enemy: " + getName() + " | Health: " + getHealth() + " | Attack: " + getAttack();
    }
}
