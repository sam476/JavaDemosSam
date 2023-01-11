package com.cognixia.jump.inheritanceandcomposition;

public class Vampire extends Monster {

	private String vampireName;
	private int age;

	// we use super to call the super class's constructor and set the attributes
	// for type and scaryLevel
	public Vampire(String vampireName, int age, ScaryLevel scaryLevel) {
		super("Vampire", scaryLevel); // set scary level, but type should always be vampire
		this.vampireName = vampireName;
		this.age = age;
	}

	public String getVampireName() {
		return vampireName;
	}

	public void setVampireName(String vampireName) {
		this.vampireName = vampireName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// overriding method in Monster class
	public void scaryNoise() {
		System.out.println("Ho Ho Ho, I'm a Vampire!");
	}
	
	// next 3 methods are overloaded methods, each have different
	// sets of parameters
	
	public void scaryNoise(String noise) {
		System.out.println(noise);
	}
	
	public void scaryNoise(String noise, int count) {
		
		for (int i = 0; i < count; i++) {
			System.out.print(noise);
		}
		System.out.println();
	}
	
	public void scaryNoise(int count) {
		
		for(int i = 0; i < count; i++) {
			System.out.print("*scary noise* ");
		}
		System.out.println();
	}

	// method below won't work, overloading doesn't allow for different return types
	
//	public String scaryNoise() {
//		return "*scary noise*";
//	}
	

	// make sure to edit toString generated to print the scary level as well
	@Override
	public String toString() {
		return "Vampire [vampireName=" + vampireName + ", age=" + age 
				+ " scaryLevel=" + getScaryLevel() + "]"; // add this part
	}

}
