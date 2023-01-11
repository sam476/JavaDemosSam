package com.cognixia.jump.inheritanceandcomposition;

import com.cognixia.jump.inheritanceandcomposition.Monster.ScaryLevel;

public class MonsterRunner {
	
	public static void main(String[] args) {
		
		// below we show overriding with the method scaryNoise for Monster and Vampire
		
		Monster m1 = new Monster("Werewolf", ScaryLevel.SCARY);
		System.out.println(m1);
		
		System.out.println("\nThe " + m1.getType() + " makes this scary noise: ");
		m1.scaryNoise();
		
		
		Vampire m2 = new Vampire("Dracula", 400, ScaryLevel.KINDA_SCARY);
		System.out.println("\n" + m2);
		
		System.out.println("\n" + m2.getVampireName() + " makes this scary noise:");
		m2.scaryNoise();
		
		
		// At runtime, it is decided which method is called, the one from Monster
		// or the one from Vampire. Even if we created a Monster of type Vampire,
		// it is still a Monster, so it will not be able to access Vampire's methods
		// if they are not overridden in some way.
		
		Monster m3 = new Vampire("Count Chocula", 100, ScaryLevel.NOT_SCARY);
		System.out.println("\nCount Chocula makes this scary noise:");
		m3.scaryNoise();
		
		
		// method overloading is shown below
		
		m2.scaryNoise("OooooOOOOOoooo");
		m2.scaryNoise("OooooOOOOOoooo", 3);
		m2.scaryNoise(4);
		
	}

}
