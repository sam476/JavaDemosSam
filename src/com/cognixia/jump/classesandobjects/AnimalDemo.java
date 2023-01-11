package com.cognixia.jump.classesandobjects;

// Core java program to demonstrate use of animal class
public class AnimalDemo {

	public static void main(String[] args) {
		// class declaration 
		Animal animal;
		
		// Object Init and show constructors 
		animal = new Animal();
		
		// both dec and init
		Animal animal2 = new Animal(45.0,"Dog","Bones",4);
		
		// Show message and methods 
		animal.setType("Cat");
		animal.setWeight(10.0);
		animal.setLegs(4);
		//animal.setFood("Fish");
		
		//print getters and toString to console 
		System.out.println(animal2.getType());
		System.out.println(animal.toString());
		System.out.println(animal2.toString());
		//System.out.println(animal2);//note this automatically calls the toString 
        
		Animal animal3 = new Whale();
		
		animal3.move();
		System.out.println(animal3);
	}

}
