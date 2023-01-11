package com.cognixia.jump.inheritanceandcomposition;

// use Source to create mostly everything within the class, make sure not to create
// a setter for the attribute type
public class Monster {

	// enum to keep track of scare level, set to public so
	// other classes can access it
	public enum ScaryLevel {
		NOT_SCARY, KINDA_SCARY, SCARY, VERY_SCARY, SUPER_SCARY
	}

	// type of monster they are...mummy, vampire, werewolf, etc.
	private String type;
	private ScaryLevel scaryLevel;

	
	// create default constructor after setting up constructor right below
	// that has fields
	public Monster() {
		this("Monster", ScaryLevel.NOT_SCARY); //note same as this.type = "Monster" this.scaryLevel = scaryLevel.NOT_SCARY
	}
	
	public Monster(String type, ScaryLevel scaryLevel) {
		super();
		this.type = type;
		this.scaryLevel = scaryLevel;
	}

	public ScaryLevel getScaryLevel() {
		return scaryLevel;
	}

	public void setScaryLevel(ScaryLevel scaryLevel) {
		this.scaryLevel = scaryLevel;
	}

	// ONLY HAVE A GETTER FOR TYPE!! Should not be able to reset it once it's set
	// when the constructor is called and object created
	public String getType() {
		return type;
	}
	
	// method to add that isn't generated
	public void scaryNoise() {
		System.out.println("Grrr");
	}

	@Override
	public String toString() {
		return "Monster [type=" + type + ", scaryLevel=" + scaryLevel + "]";
	}

}
