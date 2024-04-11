package com.jsp.swiggy;

public class Arena {
	    public static void fight(Player player1, Player player2) {
	        while (player1.getHealth() > 0 && player2.getHealth() > 0) {
	            if (player1.getHealth() < player2.getHealth()) {
	                player1.attack(player2);
	            } else {
	                player2.attack(player1);
	            }
	        }
	        if (player1.getHealth() <= 0) {
	            System.out.println("Player 1 has been defeated!");
	        } else {
	            System.out.println("Player 2 has been defeated!");
	        }
	    }
	}



