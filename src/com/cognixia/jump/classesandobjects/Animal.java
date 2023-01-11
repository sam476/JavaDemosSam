package com.cognixia.jump.classesandobjects;

public class Animal {

	//Attributes 
	private double weight;
	private String type; 
	private String food;
	private int legs; 
	
	//Constructor 
	  //Default 
	Animal (){
		weight = 0;
		type = "";
		food = "";
		legs = 0;
	}
	
	//With Arguments 
	Animal(double weight, String type, String food, int legs ){
		this.weight = weight;
		this.type = type;
		this.food = food;
		this.legs = legs; 
	}
	
	//Methods 
	  //ToString 
	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", type=" + type + " food=" + food + " legs=" + legs + "]";
	}
	  //Method to be overridden later 
	public void move() {
		System.out.println("The animal is moving");
	}
	
	//Getters and Setters 
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double wieght) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public void setLegs(int legs) {
		this.legs = legs;
		
	}

 }
