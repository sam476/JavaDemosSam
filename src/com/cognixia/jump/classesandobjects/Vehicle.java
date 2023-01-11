package com.cognixia.jump.classesandobjects;

public class Vehicle {
	
	String type;
	private String color;
	private int wheels; 
	private static int vehicleCount=0;
	
	/**
	 * 
	 */
	public Vehicle() {
		super();
		this.type = "N/A";
		this.color = "N/A";
		this.wheels = -1;
		vehicleCount++;
	}
	/**
	 * @param type
	 * @param color
	 * @param wheels
	 */
	public Vehicle(String type, String color, int wheels) {
		super();
		this.type = type;
		this.color = color;
		this.wheels = wheels;
		vehicleCount++;
	}
	
	public static int getVehicleCount() {
		return vehicleCount;
	}
	
	public String describe() {
		return "I am a vehicle";
	}
	
	public String describe(int carFeature) {
	   return "";
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", color=" + color + ", wheels=" + wheels + "]";
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the wheels
	 */
	public int getWheels() {
		return wheels;
	}

	/**
	 * @param wheels the wheels to set
	 */
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	
	
	
	

}
