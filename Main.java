package com.jsp.swiggy;

public class Main {
	    public static void main(String[] args) {
	        Player playerA = new Player(50, 5, 10);
	        Player playerB = new Player(100, 10, 5);
	        
	        Arena.fight(playerA, playerB);
	    }
	}


