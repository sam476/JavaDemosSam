package com.cognixia.jump.classesandobjects;

public class Whale extends Animal{
	
	private double breathTime;
	
   //Constructor 
   Whale(){
	   super();
	   this.breathTime = breathTime;
   }
   
   //Show override polymorphism
   @Override 
   public void move() {
	   System.out.println("The animal swims");
   }
}
