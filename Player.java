package com.jsp.swiggy;
import java.util.Random;

public class Player {
    private int health;
    private int strength;
    private int attack;
    private Random random;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }

    public int getHealth() {
        return health;
    }

    public void attack(Player opponent) {
        int attackRoll = random.nextInt(6) + 1; // Roll attacking dice
        int damageDealt = attack * attackRoll;
        
        int defenseRoll = random.nextInt(6) + 1; // Roll defending dice
        int damageDefended = opponent.strength * defenseRoll;
        
        int damageTaken = Math.max(0, damageDealt - damageDefended);
        opponent.health -= damageTaken;
        
        System.out.println("Player dealt " + damageDealt + " damage, opponent defended " + damageDefended + " damage.");
        System.out.println("Opponent's health reduced to " + opponent.health);
    }
}
